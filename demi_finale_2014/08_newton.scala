import scala.io.StdIn._
import scala.math.max
import scala.math.min

class Coordinate(val x: Int, val y: Int)

object Isaac {

  def main(args: Array[String]): Unit = {
    val size = readInt()
    val map = Array.ofDim[String](size, size)
    for (i <- 0 until size) {
      map(i) = readLine.map { x => x.toString() }.toArray
    }

    var nbRooms = 0
    for (i <- 0 until size) {
      for (j <- 0 until size) {
        if(map(i)(j) == "o")
          if (isSurroundedBy3Rooms(map, new Coordinate(j, i))) nbRooms += 1
      }
    }
    println(nbRooms)
  }

  def isSurroundedBy3Rooms(map: Array[Array[String]], square: Coordinate): Boolean = {
    var nbRoom = 0
    val maxIndex = map.length - 1
    if (map(square.y)(max(0, square.x - 1)) == "x") nbRoom += 1
    if (map(square.y)(min(maxIndex, square.x + 1)) == "x") nbRoom += 1
    if (map(max(square.y - 1, 0))(square.x) == "x") nbRoom += 1
    if (map(min(square.y + 1, maxIndex))(square.x) == "x") nbRoom += 1
    return nbRoom >= 3
  }
}

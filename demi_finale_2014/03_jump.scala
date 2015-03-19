import scala.io.StdIn._
import math._

object jump {
    def main(arg: Array[String]) = {
        val numberOfPlanets = readInt
        val planetSize: Array[Int] = for(i <- readLine split " ") yield i.toInt
        var nbOfPlanetReachable = 0

        for(i <- 0 until planetSize.length) {
            if(planetSize(max(i - 1, 0)) < planetSize(i) ||
               planetSize(min(i + 1, planetSize.length)) < planetSize(i)) nbOfPlanetReachable += 1
        }
        println(nbOfPlanetReachable)
    }
}

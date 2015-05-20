import scala.io.StdIn._

object rearrangement {
  def main(args: Array[String]): Unit = {
    val nbElements = readInt()

    val firstList = readLine().split(" ").toList.map { x => x.toInt }.sorted
    val secondList = readLine().split(" ").toList.map { x => x.toInt }.sorted

    if (firstList == secondList) println(1) else println(0)
  }
}

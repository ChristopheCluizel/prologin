import scala.io.StdIn._

object voleurs {
    def main(arg: Array[String]) = {
        val nbOfPeople = readInt
        var nbOfBags = readInt
        val contentsOfBags: Array[Int] = for(i <- readLine split " ") yield i.toInt

        contentsOfBags.filter(e => e % nbOfPeople == 0) match {
            case Array() => println(0)
            case contentsDivisible: Array[Int] => println(contentsDivisible.max)
        }
    }
}

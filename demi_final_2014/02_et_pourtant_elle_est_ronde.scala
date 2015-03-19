import scala.io.StdIn._

object et_pourtant_elle_est_ronde {
    def main(arg: Array[String]) = {
        val numberLine = readInt
        val numberSignPerLine = readInt
        var lines = List[String]()

        for(i <- 0 until numberLine) {
            lines = readLine :: lines
        }
        for(i <- lines) println(i)
    }
}

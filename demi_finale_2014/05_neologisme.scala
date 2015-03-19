import scala.io.StdIn._
import scala.collection.mutable._

object neologisme {
    def main(arg: Array[String]) = {
        val wordSize = readInt
        var word = readLine
        val dictionarySize = readInt
        var dictionary = new ArrayBuffer[String](dictionarySize)

        for(i <- 0 until dictionarySize) {
            readInt
            dictionary +=readLine
        }
        if(dictionary contains word) println(0)
        else println(1)
    }
}

/*
recursive function to determine even and odd numbers
*/

object Question4{
    def isEven(n: Int): Boolean = {
        if (n == 0) true
        else if (n == 1) false
        else isEven(n - 2)
    }

    def main(args: Array[String]): Unit = {
        println("Enter a number: ")
        val n = scala.io.StdIn.readInt()
        if (isEven(n)) println(n + " is even")
        else println(n + " is odd")
    }
}
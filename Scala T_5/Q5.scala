/*
recursive function to get the addition of all even numbers less than given n
*/

object Question5{
    def sumEven(n: Int): Int = {
        if (n == 0) 0
        else if (n % 2 == 0) n + sumEven(n - 1)
        else sumEven(n - 1)
    }

    def main(args: Array[String]): Unit = {
        println("Enter a number: ")
        val n = scala.io.StdIn.readInt()
        println(sumEven(n))
    }
}
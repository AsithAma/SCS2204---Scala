/*
recursive function print fist n Fibonacci numbers for given n
*/

object Question6{
    def fibonacci(n: Int): Int = {
        if (n == 0) 0
        else if (n == 1) 1
        else fibonacci(n - 1) + fibonacci(n - 2)
    }

    def main(args: Array[String]): Unit = {
        println("Enter n: ")
        val n = scala.io.StdIn.readInt()
        for (i <- 0 to n)
            println(fibonacci(i))
    }
}
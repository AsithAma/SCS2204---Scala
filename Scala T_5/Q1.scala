/*
Recursive function prime(n) that returns true for a prime number and false for the other
*/

object Question1{
    def prime(n: Int): Boolean = {
        if (n == 1) false
        else if (n == 2) true
        else if (n % 2 == 0) false
        else prime(n - 1)
    }

    def main(args: Array[String]): Unit = {
        println("Enter the number: ")
        val n = scala.io.StdIn.readInt()
        if (prime(n)) println(n + " is a prime number")
        else println(n + " is not a prime number")
    }
}


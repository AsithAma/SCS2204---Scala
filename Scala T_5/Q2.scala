/*
recursive function primeSeq(n) that prints all prime number which less than n
*/

object Question2{
    def prime(n: Int, i: Int=2) : Boolean = {
        if(i == n) true
        else if(n%i == 0) false
        else prime(n, i+1)
    }

    def primeSeq(n: Int) : Unit = {
        if (n > 1) {
            if (prime(n)) {
                println(n)
                primeSeq(n - 1)
            } else {
                primeSeq(n - 1)
            }
        }
    }

    def main(args: Array[String]): Unit = {
        println("Enter a number: ")
        val n = scala.io.StdIn.readInt()
        primeSeq(n)
    }    
}

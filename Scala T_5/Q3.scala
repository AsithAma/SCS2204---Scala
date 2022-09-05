/*
a recursive function returns the addition of numbers from1 to n
*/

object Question3{
    def sum(n:Int):Int = {
        if(n==1) 1
        else n+sum(n-1)
    }

    def main(args: Array[String]): Unit = {
        println("Enter a number: ")
        val n = scala.io.StdIn.readInt()
        println(sum(n))
    }
}

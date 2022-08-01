object Question2 {
    def evenOdd(n: Int): Unit =n match{
        case n if n <= 0 => println("Negative/Zero");
        case n if n%2 == 0 => println("Even");
        case _ => println("Odd");
    }

    def main(args: Array[String]): Unit = {
        print("Enter a number: ");
        val n = scala.io.StdIn.readInt();
        evenOdd(n);
    }
}
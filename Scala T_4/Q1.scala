object Question1{
    def interest(depo: Double):Double =depo match{
        case depo if depo <= 20000 => depo*.02
        case depo if depo <= 200000 => depo*.04
        case depo if depo <= 2000000 => depo*.035
        case depo if depo >= 2000000 => depo*.065
    }

    def main(args: Array[String]): Unit = {
        print("Enter the deposit amount: ");
        var depo = scala.io.StdIn.readInt();
        println("The interest is: " + interest(depo));
    }
}
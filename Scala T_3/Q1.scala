object Question1 {
    def area(radius: Double): Double = {
        math.Pi * radius * radius
    }

    def main(args: Array[String]): Unit = {
        print("Enter the radius: ");
        var radius = scala.io.StdIn.readInt();
        println( "Area of a disk with radius " + radius + " = " + area(radius))
    }
}
object Question3 {
    def volume(radius: Double): Double = {
        (4 / 3) * math.Pi * (radius * radius * radius)
    }

    def main(args: Array[String]): Unit = {
        print("Enter the radius: ");
        var radius = scala.io.StdIn.readInt();
        println( "Volume of a sphere with radius " + radius + " = " + volume(radius));
    }
}   
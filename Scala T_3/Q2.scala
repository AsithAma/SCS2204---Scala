object Question2 {

    // Converting celcius to fahrenheit
    def C_to_F ( celcius: Double ): Double = {
        celcius * 1.800 + 32.0
    } 

    // Converting fahrenheit to celcius
    def F_to_C ( fahrenheit: Double ): Double = {
        (fahrenheit - 32.0) / 1.800
    }

    def main ( args: Array[String] ): Unit = {

        print("Enter the conversion type (C to F type C or F to C type F): ");
        var option: String = scala.io.StdIn.readLine();

        if ( option == "C" ) {
            print("Enter the Celcius value: ");
            var celcius: Double = scala.io.StdIn.readDouble();
            println ( "Fahrenheit Value = " + C_to_F ( celcius ) )

        } else if ( option == "F" ) {
            print("Enter the Fahrenheit value: ");
            var fahrenheit: Double = scala.io.StdIn.readDouble();
            println ( "Celcius Value = " + F_to_C ( fahrenheit ) )

        } else {
            println ( "Invalid option" )
        }
    }
}

object Q4 {
    def Salary(workingHours: Int, otHours: Int): Float = {
        var salary :Float = 250.0f;
        var ot :Float = 85.0f;
        var weeklyTax :Float = 0.12f;

        return (workingHours*salary + ot*otHours)*(1-weeklyTax);
    }
    def main(args: Array[String]) = {
        print("Enter working hours: ");
        var workingHours = scala.io.StdIn.readInt();

        print("Enter overtime hours: ");
        var otHours = scala.io.StdIn.readInt();
        println("Salary: " + Salary(workingHours, otHours));
        }
    }
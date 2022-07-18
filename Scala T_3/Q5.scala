object Question5 {

    def easy_pace(distance_e: Int): Int = {
        distance_e * 8
    }

    def tempo(distance_t: Int): Int = {
        distance_t * 7
    }

    def main(args: Array[String]): Unit = {
        print("Enter the distance ran in Easy pace: ");
        val distance_e = scala.io.StdIn.readInt();

        print("Enter the distance ran in Tempo: ");
        val distance_t = scala.io.StdIn.readInt();

        print("Total running time = " + (easy_pace(distance_e) + tempo(distance_t)));
    }
}
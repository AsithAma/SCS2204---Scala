import scala.math._

object Question1 {
  case class Point(x_cord: Int, y_cord: Int) {
    def x: Int = x_cord;
    def y: Int = y_cord;

    def +(point: Point): Point = {
        Point(this.x_cord + point.x_cord, this.y_cord + point.y_cord)
    }

    def move(d: Int): Point = {
        Point(this.x_cord + d, this.y_cord + d)
    }

    def distance(p1: Point): Double = {
        sqrt(pow(p1.x_cord - this.x_cord, 2) + pow(p1.y_cord - this.y_cord, 2))
    }

    def invert() = {
        Point(this.y, this.x_cord)
    }
    }

  def main(args: Array[String]): Unit = {
    val p1 = new Point(2, 3);
    val p2 = new Point(4, 5);

    println("Add Points " + p1 + " " + p2 + " = " + (p1 + p2));

    println("Move p1 by 2 " + p1.move(2));

    println("Distance between p1 and p2 = " + p1.distance(p2));

    println("Invery of p1: " + p1.invert());
  }
}
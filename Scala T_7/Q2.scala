object Main extends App{
  var x = new Rational(3, 4);
  var y = new Rational(5, 8);
  var z = new Rational(2, 7);
  print(x-y-z);
}

class Rational(var num: Int, var deno: Int) {
  private var numerator: Int = num;
  private var denominator: Int = deno;

  def this(num: Int) = {
    this(num, 1);
  }

  def +(r: Rational): Rational = {
    return new Rational(
      this.numerator * r.denominator + this.denominator * r.numerator,
      this.denominator * r.denominator
    );
  }

  def -(r: Rational): Rational = {
    return new Rational(
      this.numerator * r.denominator - this.denominator * r.numerator,
      this.denominator * r.denominator
    );
  }

  def +(i: Int): Rational = {
    return new Rational(this.numerator + this.denominator * i, this.denominator);
  }

  def -(i: Int): Rational = {
    return new Rational(this.numerator - this.denominator * i, this.denominator);
  }

  def neg(): Rational = {
    return new Rational(-this.numerator, this.denominator);
  }


  override def toString = s"$numerator/$denominator"
}


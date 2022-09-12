object Main extends App{
  var x = new Rational(2, 5);
  print(x.neg());
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
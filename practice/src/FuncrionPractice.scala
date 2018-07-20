

object FuncrionPractice {
  def calculate(d1: Double, d2: Double, foo: (Double, Double) => Double): Double = foo(d1, d2);

  val add = calculate(_: Double, _: Double, _ + _);
  val subtract = calculate(_: Double, _: Double, _ - _);

  def main(args: Array[String]) {
    val a = 30;
    val b = 40;

    println(s"$a + $b = " + add(a, b));
    println(s"$a + $b = " + subtract(a, b));
  }
}


object FuncrionCurrying {
  //  Complete signature
  def add (d1 : Double) = (d2 : Double) => d1 + d2
  def subtract (d1 : Double) = (d2 : Double) => d1 - d2
  
  //  Signature provided by Scala
  def multiply (d1 : Double) (d2 : Double) = d1 * d2
  def divide (d1 : Double) (d2 : Double) = d1 / d2
  
  def main(args: Array[String]) {
    val a = 30;
    val b = 40;

    println(s"$a + $b = " + add(a)(b));
    println(s"$a + $b = " + subtract(a)(b));
    
    //  Another functions set that adds the provided value with 20 and subtract by 10
    val add20 = add(20);
    val substract10 = subtract(10);
    
    println(s"$a with add20 = " + add20(a));
    println(s"$b with subtract10 = " + substract10(b));
    
    println(s"$a * $b = " + multiply(a)(b));
    println(s"$a / $b = " + divide(a)(b));
    
    //  Another functions set that multiply by 2and divide 10 by some number
    val multiplyBy2 = multiply(2)_;
    val divide10By = divide(10)_;
    
    println(s"$a * 2 = " + multiplyBy2(a));
    println(s"10 / $b = " + divide10By(b));
  }
}
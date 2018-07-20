

object PrimeNumbers {
  lazy val NUMBER = 29;

  def main(args: Array[String]) {

//    var isPrime = true;

    //    for (i <- 2 until NUMBER) { if (NUMBER % i == 0) { isPrime = false; } }

//    isPrime = !(2 until NUMBER).exists(i => NUMBER % i == 0)
    
//    println(s"$NUMBER is prime? $isPrime");
    
    for (i <- 1 to 50) {
      println(i + " is a prime number? " + isPrime(i));
    }
    
    println("===========");
    
    (1 to 25).foreach(i => println(i + " is a prime number? " + isPrime2(i)));
  }
  
  def isPrime(num : Int) = (num > 1) && !(2 until num).exists(i => num % i == 0);
  
  val isPrime2 = (num : Int) => (num > 1) && !(2 until num).exists(i => num % i == 0); 
}
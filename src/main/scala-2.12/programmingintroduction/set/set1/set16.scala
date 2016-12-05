package programmingintroduction.set.set1

/**
  * 100以下の偶数で，2つの素数の和で表せない数の集合を求めよ．
  *
  * Created by teradashoutarou on 2016/12/05.
  */
object set16 {

  def main(args: Array[String]): Unit = {
    val evens = ( 1 to 100 ).toSet.filter( _ % 2 == 0 )
    val primes1 = (2 to 100).filter(isPrime).toSet
    val primes2 = for ( x <- primes1; y <- primes1 ) yield x + y
    val primes3 = evens diff primes2
    println( primes3 )
  }


def isPrime(n: Int): Boolean = {
  return (2 until n).forall(n % _ != 0)
}
}

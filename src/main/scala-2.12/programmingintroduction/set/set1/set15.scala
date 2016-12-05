package programmingintroduction.set.set1

/**
  * 100以下の2つの素数の和で表せる数の集合を変数 primes2 に代入せよ
  *
  * Created by teradashoutarou on 2016/12/05.
  */
object set15 {

  def main(args: Array[String]): Unit = {

    def main(args: Array[String]): Unit = {
      val primes1 = (2 to 100).filter(isPrime).toSet
      val primes2 = for ( x <- primes1; y <- primes1 ) yield x + y
      println( primes2 )
    }
  }

  def isPrime(n: Int): Boolean = {
    return (2 until n).forall(n % _ != 0)
  }
}

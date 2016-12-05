package programmingintroduction.set.set1

/**
  * 変数 primes に100以下の素数の集合を代入せよ
  *
  * Created by teradashoutarou on 2016/12/05.
  */
object set14 {

  def main(args: Array[String]): Unit = {
    val set = (2 to 100).filter(isPrime).toSet
    println( set )
  }

  def isPrime(n: Int): Boolean = {
    return (2 until n).forall(n % _ != 0)
  }
}

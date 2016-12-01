package programmingintroduction.funclist.funclist3

/**
  * 2以上10000以下の自然数のうち，
  * 2進数表現が回文になっている素数のリストを求めよ．
  * また10進数表現が回文になっている素数のリストを求めよ．
  * 2進数表現も10進数表現も回文になっている素数はあるか.
  *
  * Created by teradashoutarou on 2016/12/01.
  */
object funclist39 {

  def main(args: Array[String]): Unit = {
    println( ( 2 to 10000 ).filter( p => isPrime( p ) && palindrome( p.toString ) && palindrome( p.toBinaryString ) ) )
  }

  def isPrime(n: Int): Boolean = {
    return ( 2 until n ).forall( n % _ != 0 )
  }

  def palindrome(list: String): Boolean = {
    return list == list.reverse
  }
}

package programmingintroduction.funclist.funclist3

/**
  * 10000以下の素数の個数を求めよ．
  *
  *  Created by teradashoutarou on 2016/12/01.
  */
object funclist37 {

  def main(args: Array[String]): Unit = {
    println( ( 2 to 10000 ).count( isPrime ) )
  }

  def isPrime(n: Int): Boolean = {
    return ( 2 until n ).forall( n % _ != 0 )
  }
}

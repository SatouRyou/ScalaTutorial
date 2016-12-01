package programmingintroduction.funclist.funclist3

/**
  * k が 1 から 10 の各整数値について 10000k 以下の素数の個数を求めよ
  *
  * Created by teradashoutarou on 2016/12/01.
  */
object funclist38 {

  def main(args: Array[String]): Unit = {
    println( ( 1 to 10 ).map( k => ( 2 to 10000 * k ).count( isPrime ) ) )
  }

  def isPrime(n: Int): Boolean = {
    return ( 2 until n ).forall( n % _ != 0 )
  }
}

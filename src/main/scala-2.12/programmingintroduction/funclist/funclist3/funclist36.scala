package programmingintroduction.funclist.funclist3

/**
  * 与えられた2以上の整数 n が素数の時に真を返す関数isPrimeを定義せよ
  *
  * Created by teradashoutarou on 2016/12/01.
  */
object funclist36 {

  def main(args: Array[String]): Unit = {
    println( isPrime( 8 ) )
  }

  def isPrime(n: Int): Boolean = {
    return ( 2 until n ).forall( n % _ != 0 )
  }

  /**
    * 模範解答
    * @param n
    * @return
    */
  def isPrime2(n: Int) = (2 to math.sqrt(n).toInt).forall(n % _ != 0)
}

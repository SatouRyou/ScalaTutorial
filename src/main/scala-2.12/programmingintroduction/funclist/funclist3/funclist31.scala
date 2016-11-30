package programmingintroduction.funclist.funclist3

/**
  * 142857 を 1 倍から 7 倍までした結果のリストを求めよ
  * Created by teradashoutarou on 2016/11/30.
  */
object funclist31 {

  def main(args: Array[String]): Unit = {
    val list = ( 1 to 7 ).toList.map(x => x * 142857 )
    println( list )
  }

  // 正解
  def main2(args: Array[String]): Unit = {
    (1 to 7).map(142857 * _)
  }
}

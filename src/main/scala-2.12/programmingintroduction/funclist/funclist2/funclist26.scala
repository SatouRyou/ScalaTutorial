package programmingintroduction.funclist.funclist2

/**
  * 整数のリスト中の偶数の最大値を求める
  *
  * Created by teradashoutarou on 2016/11/29.
  */
object funclist26 {

  def main(args: Array[String]): Unit = {
    println( ( 1 to 10 ).toList.filter( _ / 2 == 0 ).max )
  }
}

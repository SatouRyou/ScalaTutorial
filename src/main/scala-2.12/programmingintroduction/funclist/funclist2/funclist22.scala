package programmingintroduction.funclist.funclist2

/**
  * 整数のリストの各要素の二乗の合計を求める
  *
  * Created by teradashoutarou on 2016/11/29.
  */
object funclist22 {

  def main(args: Array[String]): Unit = {
    val list = ( 1 to 10 ).toList.map( x => x * x ).sum
    println( list )
  }
}

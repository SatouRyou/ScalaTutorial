package programmingintroduction.funclist.funclist2

/**
  * 整数のリストの各要素の二乗の平均値を求める
  * Created by teradashoutarou on 2016/11/29.
  */
object funclist23 {

  def main(args: Array[String]): Unit = {
    val list = ( 1 to 10 ).toList
    println( list.map( x => x * x ).sum / list.length )
  }
}

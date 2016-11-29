package programmingintroduction.funclist.funclist2

/**
  * 整数のリストの各要素を二乗したリストを求める．
  *
  * Created by teradashoutarou on 2016/11/29.
  */
object funclist21 {

  def main(args: Array[String]): Unit = {
    val list = ( 1 to 10 ).toList.map( x => x * x )
    println( list )
  }
}

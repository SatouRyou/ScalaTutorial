package programmingintroduction.list.list3

/**
  * 1から7までの整数の総和，1から63までの整数の総和はいくつか．
  *
  * Created by teradashoutarou on 2016/11/27.
  */
object list31 {

  def main(args: Array[String]): Unit = {
    val sum = (1 to 7).toList.sum
    println( sum )

    val sum2 = (1 to 63).toList.sum
    println( sum2 )
  }
}

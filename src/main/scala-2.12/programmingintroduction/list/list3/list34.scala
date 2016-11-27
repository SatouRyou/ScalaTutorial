package programmingintroduction.list.list3

/**
  * 1から19までの奇数の総和を求めるにはどうすれば良いか．
  *
  * Created by teradashoutarou on 2016/11/27.
  */
object list34 {

  def main(args: Array[String]): Unit = {
    val sum = ( 1 to 19 by 2 ).toList.sum
    println( sum )
  }
}

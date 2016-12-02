package programmingintroduction.funclist.funclist5

/**
  * List(2,7,1,8).reduceLeft((a,b) => 100*a + b) の結果はどうなるか
  *
  * Created by teradashoutarou on 2016/12/02.
  */
object funclist54 {

  def main(args: Array[String]): Unit = {
    println( List(2,7,1,8).reduceLeft( 100*_ + _) )
  }
}

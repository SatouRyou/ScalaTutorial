package programmingintroduction.funclist.funclist5

/**
  * 0と1を要素とするリストで2進数を表しているとする．
  * 整数値を求めるにはどうすれば良いか．
  * たとえば List(1,1,0,1) から，13を求めるにはどうすれば良いか
  *
  * Created by teradashoutarou on 2016/12/02.
  */
object funclist52 {

  def main(args: Array[String]): Unit = {
    println( List( 1,1,0,1 ).reduceLeft( 2 * _ + _ ) )
  }
}

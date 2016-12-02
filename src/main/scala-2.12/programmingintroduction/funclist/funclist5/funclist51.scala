package programmingintroduction.funclist.funclist5

/**
  * リスト x1, x2, …, xn に対して x1 - x2 - … - xn を求めるにはどうすれば良いか．
  * たとえば List(3,1,4) に対しては 3-1-4 すなわち -2 を求めたい
  *
  * Created by teradashoutarou on 2016/12/02.
  */
object funclist51 {

  def main(args: Array[String]): Unit = {
    println( List( 3, 1, 4 ).reduceLeft( _ - _ ) )
  }
}

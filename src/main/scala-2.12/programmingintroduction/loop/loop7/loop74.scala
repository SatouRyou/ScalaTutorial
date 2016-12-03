package programmingintroduction.loop.loop7

/**
  * 1から10の整数nについて10nと10n+1を要素とするリスト 10, 11, 20, 21, …, 100, 101 を求めたい．
  * どうすれば良いか
  *
  * Created by teradashoutarou on 2016/12/03.
  */
object loop74 {
  def main(args: Array[String]): Unit = {
    println( for (n <- 1 to 10; x <- List(10*n, 10*n+1)) yield x )
  }
}

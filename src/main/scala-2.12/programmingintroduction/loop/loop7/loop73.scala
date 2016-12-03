package programmingintroduction.loop.loop7

/**
  * 3桁の整数で，各桁の数の和が10に等しいものを求めよ
  *
  * Created by teradashoutarou on 2016/12/03.
  */
object loop73 {
  def main(args: Array[String]): Unit = {
    println( for (i <- 1 to 9; j <- 0 to 9; k <- 0 to 9 if 10 == ( i + j + k ) ) yield i * 100 + j * 10 + k )
  }
}

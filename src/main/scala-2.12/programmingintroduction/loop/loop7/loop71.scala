package programmingintroduction.loop.loop7

/**
  * forを用いて 1! から 10! までを要素とするリスト(あるいはVector)を求めよ．
  *
  * Created by teradashoutarou on 2016/12/03.
  */
object loop71 {

  def main(args: Array[String]): Unit = {
    println( for (n <- 1 to 10) yield (1 to n).product )

  }
}

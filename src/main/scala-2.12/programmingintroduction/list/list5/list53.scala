package programmingintroduction.list.list5

/**
  * n 個から r 個取り出す組合せの個数 nCr を求めるにはどうすれば良いか
  *
  * Created by teradashoutarou on 2016/11/28.
  */
object list53 {

  def main(args: Array[String]): Unit = {

    val n = 10
    val r = 5
    println( (BigInt(n-r+1) to n).product / (BigInt(1) to r).product )
  }
}

package programmingintroduction.list.list5

/**
  * n 個から r 個取り出す順列の個数 nPr を求めるにはどうすれば良いか
  * Created by teradashoutarou on 2016/11/28.
  */
object list52 {

  val n = 10
  val r = 5
  println( (BigInt(n-r+1) to n).product )
}

package programmingintroduction.list.list3

/**
  * リストlistのi番目からj番目の前までの要素を取り出したリストを求めるにはどうすれば良いか．
  * なお先頭は0番目とする．i=1, j=3 の場合を考えよ．listがList(2,7,1,8)の場合はList(7,1)となる
  * Created by teradashoutarou on 2016/11/27.
  */
object list35 {

  def main(args: Array[String]): Unit = {
    val list = ( 1 to 10 ).toList
    println( list.slice(1, 3) )

  }
}

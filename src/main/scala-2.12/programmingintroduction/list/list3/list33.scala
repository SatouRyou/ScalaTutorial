package programmingintroduction.list.list3

/**
  * 整数のリストlistの全要素の平均値を求めるにはどうすれば良いか
  * (ヒント: toDouble メソッドで整数を実数に変換する必要がある)
  * Created by teradashoutarou on 2016/11/27.
  */
object list33 {

  def main(args: Array[String]): Unit = {
    val list = ( 1 to 10 )

    val heikin = list.sum.toDouble/list.length
    println( heikin )
  }
}

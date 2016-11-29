package programmingintroduction.funclist.funclist2

/**
  * 文字列のリスト中の各要素の文字列長の最大値を求める
  *
  * Created by teradashoutarou on 2016/11/29.
  */
object funclist24 {

  def main(args: Array[String]): Unit = {
    val list = List("aaaaa", "bbbb", "cccc")
    println( list.map(_.size).max )
  }
}

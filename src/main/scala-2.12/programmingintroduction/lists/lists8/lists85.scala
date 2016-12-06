package programmingintroduction.lists.lists8

/**
  * 各要素リストを集合に変換したリストを求めるにはどうすれば良いか．
  *
  * Created by teradashoutarou on 2016/12/06.
  */
object lists85 {

  def main(args: Array[String]): Unit = {
    val lists = List(List(3,1,4), List(2,7,1,8,2,8), List(0,5,7,7))

    println( lists.map(_.toSet) )
  }
}

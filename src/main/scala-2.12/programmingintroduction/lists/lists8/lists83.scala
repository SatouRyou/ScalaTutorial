package programmingintroduction.lists.lists8

/**
  * reduceLeftを用いて，要素リストを連結したリストを求めるにはどうすれば良いか
  * Created by teradashoutarou on 2016/12/6.
  */
object lists83 {

  def main(args: Array[String]): Unit = {
    val lists = List(List(3,1,4), List(2,7,1,8,2,8), List(0,5,7,7))

    println( lists.reduceLeft(_ ++ _) )
  }
}

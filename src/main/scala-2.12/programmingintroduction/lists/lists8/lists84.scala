package programmingintroduction.lists.lists8

/**
  * foldLeftを用いて，要素リストを逆順にして連結したリストを求めるにはどうすれば良いか． ヒント: 空リストは List[Int]() で表す．
  *
  * Created by teradashoutarou on 2016/12/06.
  */
object lists84 {

  def main(args: Array[String]): Unit = {
    val lists = List(List(3,1,4), List(2,7,1,8,2,8), List(0,5,7,7))

    println( lists.foldLeft(List[Int]())(_ ++ _.reverse) )
  }
}

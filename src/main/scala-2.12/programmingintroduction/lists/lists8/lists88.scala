package programmingintroduction.lists.lists8

/**
  * 行列をリストのリストで表す．
  * i行j列からm行n列を取り出した部分行列を求めるにはどうすれば良いか．
  * 変数 matrix が List(List(3,1,4,1), List(2,7,1,8), List(0,5,7,7)) である時，
  * 1行2列から2行2列を取り出した部分行列はList(List(1, 8), List(7, 7))である
  *
  * Created by teradashoutarou on 2016/12/07.
  */
object lists88 {

  def main(args: Array[String]): Unit = {
    val matrix = List(List(3,1,4,1), List(2,7,1,8), List(0,5,7,7))

    println( matrix.slice(1, 3).map(col => col.slice(2, 4)) )
  }
}

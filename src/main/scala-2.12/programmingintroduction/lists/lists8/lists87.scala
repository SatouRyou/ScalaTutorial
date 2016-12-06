package programmingintroduction.lists.lists8

/**
  *行列をリストのリストで表す．
  * 変数 matrix が List(List(3,1,4,1), List(2,7,1,8), List(0,5,7,7)) である時，
  * 転置行列を求めるにはどうすれば良いか．
  *
  * Created by teradashoutarou on 2016/12/07.
  */
object lists87 {
  def main(args: Array[String]): Unit = {
    val matrix = List(List(3,1,4,1), List(2,7,1,8), List(0,5,7,7))

    // 無理
    println( matrix.transpose )
  }
}

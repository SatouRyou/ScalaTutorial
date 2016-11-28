package programmingintroduction.func.func1

/**
  * 与えられた整数リストのi番目からj番目の前までの要素を取り出したリストを求める関数sliceを定義せよ．
  * 先頭を0番目とする
  * Created by teradashoutarou on 2016/11/28.
  */
object func15 {

  def main(args: Array[String]): Unit = {

  }

  def slice( list:List[Int], i:Int, j:Int ): List[Int] = {
    return list.slice( i, j )
  }
}

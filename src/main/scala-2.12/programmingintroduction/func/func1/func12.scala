package programmingintroduction.func.func1

/**
  * 空でない整数リストをひとつ左に回転させたリストを求める関数rotateLeftを定義せよ．
  * rotateLeft(List(1,2,3))の結果はList(2,3,1)である．
  *
  * Created by teradashoutarou on 2016/11/28.
  */
object func12 {

  def main(args: Array[String]): Unit = {
    print( rotateLeft(List(1,2,3)) )
  }

  def rotateLeft( list: List[Int] ): List[Int] = {
    return list.tail :+ list.head
  }
}

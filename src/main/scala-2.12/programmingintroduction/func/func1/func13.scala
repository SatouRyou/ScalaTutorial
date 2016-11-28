package programmingintroduction.func.func1

/**
  * 空でない整数リストをひとつ右に回転させたリストを求める関数rotateRightを定義せよ．
  * rotateRight(List(1,2,3))の結果はList(3,1,2)である
  *
  * Created by teradashoutarou on 2016/11/28.
  */
object func13 {

  def main(args: Array[String]): Unit = {
    print( rotateRight( List(1,2,3) ) )
  }

  def rotateRight( list: List[Int] ): List[Int] = {
    return list.last+:list.init
  }
}

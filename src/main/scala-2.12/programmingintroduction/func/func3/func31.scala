package programmingintroduction.func.func3

/**
  * rotateRightを総称メソッドとして定義し，実行せよ
  *
  * Created by teradashoutarou on 2016/11/28.
  */
object func31 {

  def main(args: Array[String]): Unit = {
    print( rotateRight( List(1,2,3) ) )
  }

  def rotateRight( list: List[Int] ): List[Int] = {
    return list.last+:list.init
  }
}

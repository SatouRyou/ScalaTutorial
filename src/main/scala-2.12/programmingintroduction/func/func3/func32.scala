package programmingintroduction.func.func3

/**
  * 関数palindromeを総称メソッドとして定義し，実行せよ
  *
  * Created by teradashoutarou on 2016/11/28.
  */
object func32 {

  def main(args: Array[String]): Unit = {
    print( palindrome(List(1,2,2,3,1)) )
  }

  def palindrome( list:List[Int] ): Boolean = {
    if ( list.head == list.last ) {
      if ( list.length < 4 ) {
        return true;
      }
      if ( palindrome( list.init.tail ) ) {
        return true;
      }
    }
    return false
  }

  // 模範解答
  def palindrome2(list: List[Int]): Boolean = list == list.reverse
}

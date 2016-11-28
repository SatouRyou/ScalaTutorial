package programmingintroduction.func.func1

/**
  * 整数リストが回文かどうか調べる関数palindromeを定義せよ．
  * palindrome(List(1,2,1))やpalindrome(List(1,2,2,1))は真である
  *
  * Created by teradashoutarou on 2016/11/28.
  */
object func14 {

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
  def palindrome2(list: List[Int]) = list == list.reverse
}

package programmingintroduction.loop.loop7

/**
  * 文字 a,b,c のそれぞれを1文字から3文字まで繰り返した文字列から成るリストを求めよ．
  * すなわち "a", "aa", "aaa", "b", "bb", "bbb", "c", "cc", "ccc" を求める
  *
  * Created by teradashoutarou on 2016/12/03.
  */
object loop72 {

  def main(args: Array[String]): Unit = {
    println( for ( char <- List( "a", "b", "c" ); count <- ( 1 to 3 ) ) yield char * count )
  }
}

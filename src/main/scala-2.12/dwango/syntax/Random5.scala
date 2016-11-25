package dwango.syntax

/**
  * new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList
  *
  * 以上のコードを利用して、 最初と最後の文字が同じ英数字であるランダムな5文字の文字列を1000回出力してください。
  * new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toListという値は、
  * 呼びだす度にランダムな5個の文字（Char型）のリストを与えます。
  * なお、以上のコードで生成されたリストの一部分を利用するだけでよく、
  * 最初と最後の文字が同じ英数字であるリストになるまで試行を続ける必要はありません。
  * これは、List(a, b, d, e, f)が得られた場合に、List(a, b, d, e, a)のようにしても良いということです。
  *
  * Created by teradashoutarou on 2016/11/25.
  */
object Random5 {

  def main(): Unit = {

    for (a <- 1 to 1000) {
      val char = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList

      val str = char match {
        case List(a, b, c, d, e) => List(a, b, c, d, a).mkString
      }

      println(str)
    }
  }
}
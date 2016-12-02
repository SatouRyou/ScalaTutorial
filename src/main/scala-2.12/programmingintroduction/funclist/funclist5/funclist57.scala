package programmingintroduction.funclist.funclist5

/**
  * List("a","b","c").foldLeft("e")("(" + _ + "," + _ + ")") の結果はどうなるか．
  *
  * Created by teradashoutarou on 2016/12/02.
  */
object funclist57 {

  def main(args: Array[String]): Unit = {

    println( List("a","b","c").foldLeft("e")("(" + _ + "," + _ + ")") )
  }
}

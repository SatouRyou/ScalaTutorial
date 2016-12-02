package programmingintroduction.funclist.funclist5

/**
  * List("a","b","c","d").reduceRight("(" + _ + "+1/" + _ + ")") の結果はどうなるか
  *
  * Created by teradashoutarou on 2016/12/02.
  */
object funclist59 {

  def main(args: Array[String]): Unit = {
    println( List("a","b","c","d").reduceRight("(" + _ + "+1/" + _ + ")") )
  }
}

package programmingintroduction.funclist.funclist5

/**
  * List("a","b","c").reduceLeft(_ + "," + _) の結果はどうなるか．
  * また List("a","b","c").reduceRight(_ + "," + _) の結果はどうなるか．
  * なお + は文字列の連結を求める．
  *
  * Created by teradashoutarou on 2016/12/02.
  */
object funclist56 {

  def main(args: Array[String]): Unit = {

    println( List("a","b","c").reduceLeft(_ + "," + _) )

    println( List("a","b","c").reduceRight(_ + "," + _) )
  }
}

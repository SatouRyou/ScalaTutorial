package programmingintroduction.funclist.funclist5

/**
  * List(2,7,1,8).reduceRight((a,b) => a + 100*b) の結果はどうなるか．
  *
  * Created by teradashoutarou on 2016/12/02.
  */
object funclist55 {

  def main(args: Array[String]): Unit = {
    println( List(2,7,1,8).reduceRight( _ + 100 * _) )
  }
}

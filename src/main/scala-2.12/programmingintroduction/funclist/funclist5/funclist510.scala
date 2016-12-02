package programmingintroduction.funclist.funclist5

/**
  * Created by teradashoutarou on 2016/12/02.
  */
object funclist510 {

  def main(args: Array[String]): Unit = {
    print( cfrac( List(1,1,1,1,1) ) )
  }

  def cfrac( list: List[Int] ): Double = {
    list.map( _.toDouble ).reduceRight(  _ + 1.0 / _ )
  }
}

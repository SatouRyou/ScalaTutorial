package programmingintroduction.set.set1

/**
  * 変数 evens に100以下の偶数の集合を代入せよ．
  *
  * Created by teradashoutarou on 2016/12/04.
  */
object set13 {

  def main(args: Array[String]): Unit = {
    val evens = ( 1 to 100 ).toSet.filter( _ % 2 == 0 )
    println( evens )

    val evens2 = (2 to 100 by 2).toSet
  }
}

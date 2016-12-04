package programmingintroduction.set.set1

/**
  * set1 の各要素の二乗を4で割った余りから成る集合を求めよ．
  *
  * Created by teradashoutarou on 2016/12/04.
  */
object set12 {

  def main(args: Array[String]): Unit = {
    val set1 = ( 1 to 100 ).toSet
    println( set1.map( x => x * x % 4 ) )
  }
}

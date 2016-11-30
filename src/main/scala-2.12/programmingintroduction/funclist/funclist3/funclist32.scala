package programmingintroduction.funclist.funclist3

/**
  * 1から100までの整数のうち，3の倍数でなく，また5の倍数でもない数のリストを求めよ
  *
  * Created by teradashoutarou on 2016/11/30.
  */
object funclist32 {

  def main(args: Array[String]): Unit = {
    println( ( 1 to 100 ).filter( x => x%3 != 0 ).filter( x => x%5 != 0 ) )
  }

  def main2(args: Array[String]): Unit = {
    (1 to 100).filter(n => n % 3 != 0 && n % 5 != 0)
    (1 to 100).filter(_ % 3 != 0).filter(_ % 5 != 0)
  }
}

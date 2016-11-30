package programmingintroduction.funclist.funclist3

/**
  * Integer.parseInt(s, 2) を用いると，
  * 2進数表現である文字列sから，整数値に変換できる．
  * 最初の10個の2進単眼数の整数値から成るリストを求めよ
  *
  * Created by teradashoutarou on 2016/11/30.
  */
object funclist34 {

  def main(args: Array[String]): Unit = {
    println( ( 1 to 10 ).map( x => "1" * x + "0" + "1" * x ).map( s => Integer.parseInt(s, 2) ) )
  }
}

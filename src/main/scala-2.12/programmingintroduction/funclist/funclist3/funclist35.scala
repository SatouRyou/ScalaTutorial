package programmingintroduction.funclist.funclist3

/**
  * x.toBinaryString を用いると，整数xの2進数表現の文字列を求めることができる．
  * 1800以上2100以下の自然数のうち，2進数表現が回文になっている値のリストを求めよ
  *
  * Created by teradashoutarou on 2016/11/30.
  */
object funclist35 {
  def main(args: Array[String]): Unit = {
    print( ( 1800 to 2100 ).filter( x => x.toBinaryString == x.toBinaryString.reverse ) )
  }
}

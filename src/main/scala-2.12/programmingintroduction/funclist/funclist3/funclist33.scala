package programmingintroduction.funclist.funclist3

/**
  * 0, 101, 11011, 1110111, 111101111, 11111011111 のように，中央に0があり，
  * 左右に同じ個数の1が並んでいる数を2進単眼数(http://oeis.org/A138148)という．
  * 最初の10個の2進単眼数の文字列から成るリストを求めよ．
  * ヒント: "1"*n で，1をn回繰り返した文字列が得られる．
  * また + は文字列の連結を求める． たとえば "1"*2+"0"+"1"*2 の結果は "11011" である
  *
  * Created by teradashoutarou on 2016/11/30.
  */
object funclist33 {

  def main(args: Array[String]): Unit = {
    println( ( 1 to 10 ).map( x => "1" * x + "0" + "1" * x ) )
  }
}

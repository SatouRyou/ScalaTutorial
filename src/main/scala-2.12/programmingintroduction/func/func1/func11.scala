package programmingintroduction.func.func1

/**
  * n 個から r 個取り出す順列の個数 nPr を求める関数 permutation(n, r) を定義せよ
  *
  * Created by teradashoutarou on 2016/11/28.
  */
object func11 {

  def main(args: Array[String]): Unit = {
    print( permutation( 10, 5 ) )
  }

  def permutation( n: Int, r: Int ): BigInt = {
    return (BigInt(n-r+1) to n).product
  }
}

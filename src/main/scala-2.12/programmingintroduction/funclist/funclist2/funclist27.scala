package programmingintroduction.funclist.funclist2

/**
  * 整数のリスト中に偶数が含まれているかどうか調べる
  *
  * Created by teradashoutarou on 2016/11/29.
  */
object funclist27 {

  println( ( 1 to 10 ).toList.exists( _ % 2 == 0 ) )
}

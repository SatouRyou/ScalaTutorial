package dwango.syntax

/**
  * var age: Int = 5という年齢を定義する変数と
  * var isSchoolStarted: Boolean = falseという就学を開始しているかどうかという変数を利用して、
  * 1歳から6歳までの就学以前の子どもの場合に“幼児です”と出力し、
  * それ以外の場合は“幼児ではありません”と出力するコードを書いてみましょう。
  *scala
  * Created by teradashoutarou on 2016/11/24.
  */
object isSchoolStarted {

  def main( args: Array[String] ): Unit = {
    var age: Int = 5
    var isSchoolStarted: Boolean = false

    if ( 1 <= age && age <= 6 && !isSchoolStarted ) {
      print( "幼児です" )
    } else {
      print( "幼児ではありません" )
    }
  }
}

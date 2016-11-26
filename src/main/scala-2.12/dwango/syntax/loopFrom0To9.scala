package dwango.syntax

/**
  * do whileを利用して、
  * 0から数え上げて9まで出力して10になったらループを終了するメソッドloopFrom0To9を書いてみましょう。
  * loopFrom0To9は次のような形になります。???の部分を埋めてください
  *
  * Created by teradashoutarou on 2016/11/24.
  */
object loopFrom0To9 {

  def main( args: Array[String] ): Unit = {
    var i = 0
    do {
      print(0)
      i += 1
    } while( i < 10 )
  }
}

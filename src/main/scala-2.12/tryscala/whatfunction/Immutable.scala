package tryscala.whatfunction

/**
  * Created by teradashoutarou on 2016/12/12.
  */
object Immutable {

  def main(args: Array[String]){
    val immutable = "Immutable"
    printf("%s ", immutable)

    // エラーが出ていることを学習
    immutable = "Change immutable"
    printf("%s ", immutable)
  }
}

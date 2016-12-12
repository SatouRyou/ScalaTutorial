package tryscala.whatfunction

/**
  * Created by teradashoutarou on 2016/12/12.
  */
object Mutable {

  def main(args: Array[String]){
    var mutable = "Mutable"
    printf("%s ", mutable)

    mutable = "Change mutable"
    printf("%s ", mutable)
  }
}

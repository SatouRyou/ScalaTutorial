package tryscala.whatfunction

/**
  * Created by teradashoutarou on 2016/12/12.
  */
object NoneSideEffect {

  def main(args: Array[String]){
    var add = (x: Int) => x + 5

    printf("add=%s \n", add(1))
    printf("add=%s \n", add(1))
    printf("add=%s \n", add(1))
  }
}

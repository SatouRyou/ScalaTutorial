package tryscala.helloworld

/**
  * Created by teradashoutarou on 2016/12/11.
  */
object reHelloWorld {

  def main(args: Array[String]){
    if(args.size == 0) {
      val strs = Array("Hello", "World")
      output(strs)
    } else {
      printf("Invalid args.")
    }
  }

  def output(strs: Array[String]){
    strs.foreach(printf("%s ", _))
  }
}

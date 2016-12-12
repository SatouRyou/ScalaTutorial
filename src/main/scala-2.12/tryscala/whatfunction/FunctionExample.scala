package tryscala.whatfunction

/**
  * Created by teradashoutarou on 2016/12/12.
  */
object FunctionExample {

  def main(args: Array[String]){

    var calculate = (x: Int) => x + 5 : Int

    printf("y=%s \n", calculate(1))
    printf("y=%s \n", calculate(2))
  }
}

package programmingintroduction.funclist.funclist5

/**
  * x ^ y は x と y のビット毎のXOR (exclusive or; 排他的論理和; x⊕y)を返す．
  * 0から7までのXOR，すなわち 0 ^ 1 ^ 2 ^ ... ^ 7 はいくつになるか．
  * また，0から15までのXOR，0から31までのXORはそれぞれどうなるか
  *
  * Created by teradashoutarou on 2016/12/02.
  */
object funclist53 {

  def main(args: Array[String]): Unit = {
    println( ( 1 to 7 ).reduce( _ ^ _ ) )
  }
}

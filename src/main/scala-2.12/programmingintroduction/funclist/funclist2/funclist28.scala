package programmingintroduction.funclist.funclist2

/**
  * 整数のリストの全要素が奇数になっているかどうか調べる．
  *
  * Created by teradashoutarou on 2016/11/29.
  */
object funclist28 {

  println( ( 1 to 10 ).toList.forall( _ % 2 == 1 ) )
}

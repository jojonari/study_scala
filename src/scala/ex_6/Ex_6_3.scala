package scala.ex_6

/**
  * Created by jojonari on 2017. 1. 3..
  */
object Ex_6_3 {
  def main(args: Array[String]): Unit = {
    val number1 = "010-1111-1111"
    val number2 = "119"
    val number3 = "포도먹은 돼지"
    val numberList = List(number1, number2, number3)

    for(number <- numberList){
      number match {
        case Emergency() => println("긴급 전화")
        case Nomal(number) => println("일반 전화" + number)
        case _ => println("판단 불가능")
      }
    }
  }
}

object Emergency{
  def unapply(number: String):Boolean = {
    if(number.length == 3 && number.forall(_.isDigit))true
    else false
  }
}

object Nomal{
  def unapply(number: String): Option[Int] ={
    try{
      var o = number.replaceAll("-", "")
      Some(number.replaceAll("-", "").toInt)
    }catch {
      case _: Throwable => None
    }
  }
}

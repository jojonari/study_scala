package scala.ex_5

/**
  * Created by jojonari on 2017. 1. 3..
  */
object Ex_5_4 {
  def main(args: Array[String]) = {
    val thisYear = 2017

    //아직 인수가 존재하지 않지만 _ 와일드카드를 사용해 어느 String 값이든 들어올 수 있다고 선언
    val fixedValueFunction = go(thisYear, _ : String)

    // go()가 아니라 fixedValueFunction 형태로 호출
    fixedValueFunction("test1")
    fixedValueFunction("test2")
    fixedValueFunction("test3")
  }
  def go(thisYeqr : Int, string: String)={
    println(string + " : " + thisYeqr)
  }
}

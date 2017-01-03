package scala.ex_5

/**
  * Created by jojonari on 2017. 1. 3..
  */
object Ex_5_1 {
  def main(args: Array[String]) = {   //리턴타입 생략
    println("반환받은 값 : " + name())
  }

  def name() = {  // 리턴타입 생략
    val a = 10
    a             //return 생략
  }
}

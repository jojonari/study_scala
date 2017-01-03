package scala.ex_5

/**
  * Created by jojonari on 2017. 1. 3..
  */
object Ex_5_7 {
  def main(args: Array[String]) = {
  println("기본 값은 " + defalt())
  }
  def defalt(a: Int = 4, b: Int =5) : Int = a + b
}

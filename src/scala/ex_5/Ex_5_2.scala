package scala.ex_5

/**
  * Created by jojonari on 2017. 1. 3..
  */
object Ex_5_2 {
  def main(args: Array[String]) = {   //리턴타입 생략
    val result = sum(1,2)
    println(result)
  }

  def sum(a:Int, b: Int):Int = a + b
}

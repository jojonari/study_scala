package scala.ex_8

/**
  * Created by jojonari on 2017. 1. 8..
  */
object Ex_8_8 {
  def main(args: Array[String]): Unit = {

    val o = List(List(1, 2, 3, 4, 5, 6, 7, 0), List(8,9,10))

    val n = o.flatten

    println(n)
  }
}

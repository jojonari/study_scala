package scala.ex_8

/**
  * Created by jojonari on 2017. 1. 8..
  */
object Ex_8_1 {
  def main(args: Array[String]): Unit = {

    val o = List(1, 2, 3, 4)
    println(o)

    val n = o.map(_ * 10)
    println(n)
  }
}

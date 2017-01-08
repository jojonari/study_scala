package scala.ex_8

/**
  * Created by jojonari on 2017. 1. 8..
  */
object Ex_8_4 {
  def main(args: Array[String]): Unit = {

    val o = List(1, 2, 3, 4)
    val n = o.partition(i => i < 3)

    println(n)
  }
}

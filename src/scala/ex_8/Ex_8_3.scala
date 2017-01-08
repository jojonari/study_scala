package scala.ex_8

/**
  * Created by jojonari on 2017. 1. 8..
  */
object Ex_8_3 {
  def main(args: Array[String]): Unit = {

    val o = List(1, 2, 3, 4)
    val n = o.foldLeft(0)((i,j) => i + j)

    println(n)
  }
}

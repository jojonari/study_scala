package scala.ex_8

/**
  * Created by jojonari on 2017. 1. 8..
  */
object Ex_8_2 {
  def main(args: Array[String]): Unit = {

    val o = List(1, 2, 3, 4)
    val n = o.filter(i => i >=3).map( i=> i * 2)

    println(n)
  }
}

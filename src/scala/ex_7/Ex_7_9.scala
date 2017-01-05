package scala.ex_7

/**
  * Created by jojonari on 2017. 1. 5..
  */
object Ex_7_9 {
  def main(args: Array[String]): Unit = {
    var students = Map(
      1 -> "고지용",
      2 -> "김말자",
      3 -> "김말이"
    )

    val one = students.get(1)
    val four = students.get(4)

    println(one)
    println(four)
    println(one.get)
    println(four.getOrElse("값이 없습니다"))

  }
}

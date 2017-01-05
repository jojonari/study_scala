package scala.ex_7

/**
  * Created by jojonari on 2017. 1. 5..
  */
object Ex_7_6 {
  def main(args: Array[String]): Unit = {
    val map = Map(
      "number1" -> "aa",
      "number2" -> "bb",
      "number3" -> 11,
      "number4" -> 33,
      5 -> "cc"
    )

    println(map.isEmpty)
    println("whole map : "+ map)
    println("keys : " + map.keys)
    println("values : " + map.values)
    println(map("number1"))

  }
}

package scala.ex_4

/**
  * Created by jojonari on 2017. 1. 2..
  */
object Ex_4_3 {
  def main(args: Array[String]): Unit = {
    val apple = Fruit2("사과")

    println(apple.name)
  }
}

case class Fruit2(name : String)
package scala.ex_5

/**
  * Created by jojonari on 2017. 1. 3..
  */
object Ex_5_3 {
  def main(args: Array[String]) = {
    dropship(people(5))
  }

  def people(n: Int) = {
    println("탑승수속을 시작합니다")
    n
  }

  def dropship(n: => Int) = {
    println("드랍쉽 준비합니다")
    println(n+ "명 탑승했습니다")
  }
}

package scala.ex_5

/**
  * Created by jojonari on 2017. 1. 3..
  */
object Ex_5_8 {
  class SomeClass {
    def apply(m: Int) = method(m)

    def method(i: Int) = i + i

    def merthod2(s: String) = s
  }

  def main(args: Array[String]): Unit = {
    val somthing = new SomeClass
    println(somthing(2))
  }
}

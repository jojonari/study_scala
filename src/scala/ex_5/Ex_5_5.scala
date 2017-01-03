package scala.ex_5

/**
  * Created by jojonari on 2017. 1. 3..
  */
object Ex_5_5 {
  def main(args: Array[String]) = {
   val g = f _
    println(f(1))

    //val g1: (Int => Int) = f
  }
  def f(i:Int) =i
  // def f = (i:Int) => i
}

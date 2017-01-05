package scala.ex_7

/**
  * Created by jojonari on 2017. 1. 5..
  */
object Ex_7_1 {
  def main(args: Array[String]): Unit = {
    val arrayA = Array(1, 2, 3, 4, 5)
    for(x <- arrayA){
      println(x)
    }

    val arrayB = Array("A","B","C","D","E","F")
    for(x <- arrayB){
      println(x)
    }
  }
}

package test

/**
  * Created by jojonari on 2017. 1. 1..
  */
object Ex_3_5 {
  def main(args: Array[String]): Unit = {
   for (x <- (1 to 10) if (x % 2 == 0)){
     println(x)
   }
  }
}

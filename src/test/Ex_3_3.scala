package test

/**
  * Created by jojonari on 2017. 1. 1..
  */
object Ex_3_3 {
  def main(args: Array[String]): Unit = {
   for (x <- 2 to 9){
     for (y <- 1 to 9){
       println(x + " * " + y + " = " + x * y)
     }
   }
  }
}

package scala.ex_7

/**
  * Created by jojonari on 2017. 1. 5..
  */
object Ex_7_3 {
  def main(args: Array[String]): Unit = {
    val list = "a" :: "b" :: "c" :: Nil
    for(x <- 0 until list.size){
      println(list(x))
    }

  }
}

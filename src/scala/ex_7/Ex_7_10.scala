package scala.ex_7

/**
  * Created by jojonari on 2017. 1. 5..
  */
object Ex_7_10 {
  def main(args: Array[String]): Unit = {
    val list = List("a", "b", "c")
    val i = list.iterator

    while (i.hasNext){
      println(i.next())
    }
  }
}

package scala.ex_9

import java.io.{File, PrintWriter}

/**
  * Created by jojonari on 2017. 1. 8..
  */
object  Ex_9_6 {
  def main(args: Array[String]): Unit = {
    object Object1{
      private def ma ={}
      def md ={}
    }

    object Object2{
//      val a = Object1.ma
      val b = Object1.md
    }

    def main(args: Array[String]): Unit = {
      println(Object1.md)
      println(Object2.b)
    }

  }
}

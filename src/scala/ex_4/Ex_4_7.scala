package scala.ex_4

/**
  * Created by jojonari on 2017. 1. 2..
  */
object Ex_4_7 {
  def main(args: Array[String]): Unit = {
    val pig = new pig
    pig.eat
    pig.shout
    pig.fly
  }


  class pig extends Animal with Flying with Eating {
    def shout = println("꿀꿀 ~")

    def eat = println("쩝쩝 ~")
  }

  abstract class Animal {
    def shout
  }

  trait Swimming {
    def swim = println("수영을 합니다 촤아~~")
  }

  trait Flying {
    def fly = println("하늘을 납니다 휘리릭~~")
  }

  trait Running {
    def run = println("달립니다 슈웅~")
  }

  trait Eating {
    def eat
  }

}
package scala.ex_4

/**
  * Created by jojonari on 2017. 1. 2..
  */
object Ex_4_5 {
  def main(args: Array[String]): Unit = {
    val flyingWhale = new Animal
    flyingWhale.fly
    flyingWhale.swim
  }
}

class Animal extends Flying with Swimming

trait Swimming{
  def swim = println("수영을 합니다 촤아~~")
}

trait Flying{
  def fly = println("하늘을 납니다 휘리릭~~")
}

trait Running{
  def run = println("달립니다 슈웅~")
}

trait Eating{
  def eat
}
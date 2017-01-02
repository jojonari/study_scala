package scala.ex_4

/**
  * Created by jojonari on 2017. 1. 2..
  */
object Ex_4_9 {
  def main(args: Array[String]): Unit = {
    val robot = new SuperMazinga
    println(robot.shoot)
  }
}

class SuperMazinga extends AnotherRobot with AnotherM16 with AnotherBazooka with AnotherDaepodong

abstract class AnotherRobot{
  def shoot = "뿅뿅"
}

trait AnotherM16 extends AnotherRobot{
  override def shoot: String = super.shoot + "빵야"
}

trait AnotherBazooka extends AnotherRobot{
  override def shoot: String = super.shoot + "뿌왕뿌왕"
}

trait AnotherDaepodong extends AnotherRobot{
  override def shoot: String = super.shoot + "콰르르르릉"
}
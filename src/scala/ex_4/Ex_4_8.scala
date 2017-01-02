package scala.ex_4

/**
  * Created by jojonari on 2017. 1. 2..
  */
object Ex_4_8 {
  def main(args: Array[String]): Unit = {
    val robot = new Mazinga
    println(robot.shoot)
  }
}

class Mazinga extends Robot with M16 with Bazooka with Daepodong

abstract class Robot{
  def shoot = "뿅뿅"
}

trait M16 extends Robot{
  override def shoot = "빵야"
}

trait Bazooka extends Robot{
  override def shoot: String = "뿌왕뿌왕"
}

trait Daepodong extends Robot{
  override def shoot: String = "콰르르르릉"
}
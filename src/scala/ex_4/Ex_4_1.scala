package scala.ex_4

/**
  * Created by jojonari on 2017. 1. 2..
  */
object Ex_4_1 {
  def main(args: Array[String]): Unit = {
    val car = new Vehicle

    println(car.price)
    println(car.hood)
  }
}

class Vehicle(){
  var price: Int = 100000
  var hood: String = "expensive Hood"
}

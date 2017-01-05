package scala.ex_7

/**
  * Created by jojonari on 2017. 1. 5..
  */
object Ex_7_5 {
  def main(args: Array[String]): Unit = {
    val list1 = "a" :: "b" :: "c" :: Nil
    val list2 = 1 :: 2 :: 3 :: Nil
    val list3 = "2" :: "2" :: "4" :: Nil

    println(list1++list2)
    println(list1.apply(0))
    println(list1.reverse)
    println(list2.max)
    println(list2.min)
    println(list2.sum)
    println(list2.mkString(", "))
    println(list2.exists(a => a > 3))
    println(list2.exists(_ > 3))
    println(list2.contains(1))
    println(list2.isEmpty)
    println(list3.distinct)

  }
}

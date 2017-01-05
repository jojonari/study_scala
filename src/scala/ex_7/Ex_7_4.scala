package scala.ex_7

/**
  * Created by jojonari on 2017. 1. 5..
  */
object Ex_7_4 {
  def main(args: Array[String]): Unit = {
    val list1 = "a" :: "b" :: "c" :: Nil
    val list2 = "d" :: "e" :: "9" :: Nil
    val list3 = "1" :: "2" :: "3" :: Nil
    val list4 = "4" :: "5" :: "A" :: Nil

    val list0 = list1 ::: list2 ::: list3 ::: list4
    for(x <- 0 until list0.size){
      println(list0(x))
    }

  }
}

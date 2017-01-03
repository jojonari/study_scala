package scala.ex_5

/**
  * Created by jojonari on 2017. 1. 3..
  */
object Ex_5_6 {
  def main(args: Array[String]) = {
    val result = calc (x => x * x, 2, 5)
    println(result)
  }

  def calc (f:Int => Int, start : Int, end : Int)={
    //합계를 구하는 재귀함수
    def loop(index:Int, sum:Int):Int ={
      if(index > end) sum //인덱스가 끝 값 보다 크면 sum을 반환
      else loop(index +1 ,f(index) + sum) // 아니면 계속 더합니다
    }

    loop(start, 0)
  }
}

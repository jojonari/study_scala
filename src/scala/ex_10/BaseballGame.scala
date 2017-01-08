package scala.ex_10

import scala.util.Random
import scala.ex_10.Ex_10_1.convertInputs
import scala.ex_10.Ex_10_3.BallCount
import scala.ex_10.Ex_10_3.calcBallCountSeq

/**
  * Created by jojonari on 2017. 1. 8..
  */
object BaseballGame {
  def main(args: Array[String]): Unit = {
    println("야구 게임을 시작합니다")
    val ballList = Random.shuffle(0 to 9).drop(7)

    while (true){
      print("숫자를 입력하세요(000~999) : ")
      val inputList = convertInputs(scala.io.StdIn.readLine)

      if (inputList != None) {
        val ballCount = calcBallCountSeq(ballList, inputList.get)

        ballCount match {
          case BallCount(0, 0, 0) =>
            println("아웃입니다")
          case BallCount(3, 0, 0) =>
            println("3스트라이크입니다 .프로그램을 종료합니다 "); System.exit(0)
          case BallCount(strikes, 0, 0) =>
            println(s"$strikes 스트라이크")
          case BallCount(0, balls, 0) =>
            println(s"$balls 볼!")
          case BallCount(strikes, balls, 0) =>
            println(s"$strikes 스트라이크 $balls 볼!!")
          case _ =>
            println("처리 불가")
        }
      }else {
        println("제대로된 값을 입력하세요")
      }
    }
  }

}

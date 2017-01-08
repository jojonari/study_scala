package scala.ex_10

/**
  * Created by jojonari on 2017. 1. 8..
  */
object Ex_10_3 {
  def calcBallCountSeq(ballList : Seq[Int], inputList: Seq[Int]): BallCount ={
    var strikes = 0
    var balls = 0
    var outs = 0

    for(i <- 0 until ballList.length){
      if(ballList(i) == inputList(i)) strikes += 1
      else if (inputList.contains(ballList(i))) balls += 1
    }
    BallCount(strikes, balls, outs)
  }

  case class BallCount(strikes:Int, balls:Int, outs:Int)

}

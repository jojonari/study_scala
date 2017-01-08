package scala.ex_9

import java.io.{File, PrintWriter}

/**
  * Created by jojonari on 2017. 1. 8..
  */
object  Ex_9_5 {
  def main(args: Array[String]): Unit = {
    val fileName = "Ex9_5result.txt"
    var input = scala.io.StdIn.readLine("파일에 쓸내용은 ??? : ")

    val writer = new PrintWriter(new File(fileName))
    writer.write(input)
    writer.close

    println("입력하신 " + input +"텍스트를 " +fileName+"에 저장했습니다")
  }
}

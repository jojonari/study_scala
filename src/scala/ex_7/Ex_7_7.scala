package scala.ex_7

/**
  * Created by jojonari on 2017. 1. 5..
  */
object Ex_7_7 {
  def main(args: Array[String]): Unit = {
    var student1Ban = Map(
      1 -> "고지용",
      2 -> "김말자",
      3 -> "김말이",
      4 -> "김이블",
      5 -> "이재현",
      6 -> "정미쳐",
      7 -> "차수홍",
      8 -> "최예림",
      9 -> "최한잔"
    )

    student1Ban += 10 -> "전학생"    //전학생이와서 추가
    student1Ban -= 9                // 전학가서 삭제

    //반을 추가함
    var student2Ban = Map(
      11 -> "고세융",
      12 -> "김육삼",
      13 -> "김참치",
      14 -> "김한수"
    )

    //반을 합칩

    var students = student1Ban ++ student2Ban

    students.foreach( i => println(i))
    println("여기 5번 없나??")
    println(students.contains(5))

  }
}

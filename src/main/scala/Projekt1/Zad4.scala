package Projekt1

object Zad4 extends  App {
  def op(total: String, cur: String) = total + cur
//  a
  val resultA = CommonData.dayList.foldLeft(new StringBuilder){ (sb, s) => sb append s + ',' }.toString.dropRight(1)
  println(resultA)
//  b
  val resultB = CommonData.dayList.foldRight(""){(sb, s) => (sb+",").concat(s)}.toString.dropRight(1)
  println(resultB)
//  c
  val resultC = CommonData.dayList.filter(x=>x.head == 'P').foldLeft(new StringBuilder){ (sb, s) => sb append s + ',' }.toString.dropRight(1)
  println(resultC)
}

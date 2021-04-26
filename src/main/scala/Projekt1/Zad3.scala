package Projekt1

import scala.annotation.tailrec

object Zad3 extends App{

  @tailrec def concatenateWithRecurencyTail(list:List[String],result: String, i:Int) : String =
  {
    if(i==list.size)
    {
      return result
    }
    var resultTMP = result
    if (!result.equals("")) resultTMP += ','
    resultTMP = resultTMP.concat(list(i))
    return concatenateWithRecurencyTail(list,resultTMP,i+1)
  }
  val result = concatenateWithRecurencyTail(CommonData.dayList,"",0)
  println(result)
}

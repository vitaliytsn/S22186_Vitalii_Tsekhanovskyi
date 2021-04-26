package example

object Zad2  extends App{
  def concatenateWithRecurency(list:List[String],result: String, i:Int) : String =
  {
    if(i<list.size)
      {
        var resultTMP = result
        if (!result.equals("")) resultTMP += ','
        resultTMP = resultTMP.concat(list(i))
        return concatenateWithRecurency(list,resultTMP,i+1)
      }
      return result

  }
  def concatenateWithRecurencyReverse(list:List[String],result: String, i:Int) : String =
  {
    if(i>=0)
    {
      var resultTMP = result
      if (!result.equals("")) resultTMP += ','
      resultTMP = resultTMP.concat(list(i))
      return concatenateWithRecurencyReverse(list,resultTMP,i-1)
    }
      return result

  }
  val result = concatenateWithRecurency(CommonData.dayList,"",0)
  println(result)
  val resultReverse = concatenateWithRecurencyReverse(CommonData.dayList,"",CommonData.dayList.size-1)
  println(resultReverse)
}

package Projekt1

object Zad8 extends  App {
  def selectListWithOutZero(list:List[Int],result: List[Int], i:Int) : List[Int] = {
  {
    if(i<list.size)
    {
      var resultTMP = result
      if(list(i)!=0) resultTMP = resultTMP.appended(list(i))
      return selectListWithOutZero(list,resultTMP,i+1)
    }
    return result
  }
  }
  val rawList = List(1,2,0,3,4)
  var result = selectListWithOutZero(rawList,List(),0)
  println(result)
}

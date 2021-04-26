package Projekt1

object Zad10 extends  App{
  def FilterModulo(list :List[Double]):List[Double] = {
    list.filter(x=> x>(-5) && x<12).map(x=>x.abs)
  }
  val rawList = List(13,10,8,5,1,-1,-5,-8,-10,-13.0)
  var resultList = FilterModulo(rawList)
  println(resultList)
}

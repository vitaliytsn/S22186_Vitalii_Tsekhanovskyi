package example

object Zad1 extends App{

    def concatenateWithLoopFor(list:List[String]) : String =
      {
        var result = ""
          for(str <-list) {
            if (!result.equals("")) result += ','
            result = result.concat(str)
            }
            result
      }
      def concatenateWithLoopWhile(list:List[String]) : String =
      {
        var result = ""
        var i = 0
        val s = list.size
        while (i<s)
          {
            if (!result.equals("")) result += ','
            result = result.concat(list(i))
            i+=1
          }
        result
      }
  println(concatenateWithLoopFor(CommonData.dayList))
  println(concatenateWithLoopFor(CommonData.dayList.filter(x=>x.head == 'P')))
  println(concatenateWithLoopFor(CommonData.dayList))
}



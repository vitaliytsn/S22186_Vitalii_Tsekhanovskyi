package example

object Zad6 extends  App{
  def tuplePrint(tuple3: Tuple3[String,Int,Double]): Unit ={
    println(tuple3._1)
    println(tuple3._2)
    println(tuple3._3)
  }
  tuplePrint(("tupletest",1,2.0))
}

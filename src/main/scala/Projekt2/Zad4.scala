package Projekt2

object Zad4 extends  App {
  def func(operation:(Int) => Int, x:Int): Int={
    var y = operation(x)
    y = operation(y)
    y = operation(y)
    y
  }
  def squere(x:Int):Int = {
    x*x
  }
  println(func(squere,2))
}

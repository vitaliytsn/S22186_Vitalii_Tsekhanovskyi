package Projekt2

class KontoBankowe (var stanKonta : Double = 0.0) {

  def wplata(kwota: Double): Unit = {
    stanKonta +=kwota;
  }
  def wyplata(kwota: Double): Unit = {
    stanKonta -=kwota;
  }
}

object Zad2 extends App {
  val konto = new  KontoBankowe();
  println(konto.stanKonta)
  konto.wplata(155)
  println(konto.stanKonta)
  konto.wyplata(140)
  println(konto.stanKonta)
}

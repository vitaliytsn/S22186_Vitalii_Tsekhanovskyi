package Projekt2

class Osoba  (var Imie : String,var Nazwisko : String) {
}

object Zad3 extends App {
  def przywitanie(ludek: Osoba): String = ludek.Imie match {
    case "Czarek" => "Cześć mordo"
    case "Remigiusz" => "Dzień dobry panie szefie"
    case "Bartek" => "Uhu"
  }
  def przywitanie2(ludek: Osoba): String = ludek.Nazwisko match {
    case "Kowalski" => "Cześć"
    case "Nowak" => "Dzień dobry"
  }
  val osoba1 = new Osoba(Imie = "Czarek",Nazwisko = "Kowalski")
  val osoba2 = new Osoba(Imie = "Remigiusz",Nazwisko = "Kowalski")
  val osoba3 = new Osoba(Imie = "Bartek", Nazwisko = "Nowak")
  println(przywitanie(osoba1))
  println(przywitanie(osoba2))
  println(przywitanie(osoba3))
  println(przywitanie2(osoba1))
  println(przywitanie2(osoba2))
  println(przywitanie2(osoba3))
}

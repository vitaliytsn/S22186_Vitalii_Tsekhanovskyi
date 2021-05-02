package Projekt2

object Zad1 extends  App {

  def matchTest(x: String): String = x match {
    case "Poniedziałek" => "Praca"
    case "Wtorek" => "Praca"
    case "Środa" => "Praca"
    case "Czwartek" => "Praca"
    case "Piątek" => "Praca"
    case "Sobota" => "Weekend"
    case "Niedziela" => "Weekend"
    case _ => "Nie ma takiego dnia"
  }
  println(matchTest("Piątek"));
  println(matchTest("Niedziela"));
}

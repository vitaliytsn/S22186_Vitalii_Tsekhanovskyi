package Projekt2

trait Podatnik{
  def Podatek() : Int
}
class OsobaZad5 (var imie : String,var nazwisko : String, var podatek : Int) extends Podatnik{
  override def Podatek:Int ={
    podatek
  }
  def Nazwisko:String = {
    nazwisko
  }
  def Imie:String={
    imie
  }
}
trait Student extends Podatnik{
  override def Podatek:Int ={
    0
  }
}

trait Nauczyciel extends Pracownik {
  override def Podatek:Int ={
    _pensja/10
  }
}

trait Pracownik extends Podatnik{
  var _pensja : Int = 0
  override def Podatek:Int ={
    20
  }
  def pensja = _pensja
  def pensja(value:Int)={
    _pensja = value
  }
}


object Zad5 extends App{
  var student = new OsobaZad5("Mateusz","Nowak",18) with Student
  println(student.Podatek)
  var pracownik = new OsobaZad5("Mateusz","Nowak",18) with Pracownik
  println(pracownik.Podatek)
  var nauczyciel = new OsobaZad5("Mateusz","Nowak",18) with Nauczyciel
  nauczyciel.pensja(5000)
  println(nauczyciel.Podatek)

  var podmiotOsobowy = new OsobaZad5("Podmiot","Osoba",podatek = 10) with Student with Pracownik
  println(podmiotOsobowy.Podatek)

  var podmiotOsobowy2 = new OsobaZad5("Podmiot","Osoba",podatek = 10) with Pracownik with Student
  println(podmiotOsobowy2.Podatek)
}
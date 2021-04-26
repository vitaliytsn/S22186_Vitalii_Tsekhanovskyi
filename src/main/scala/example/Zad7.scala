package example

object Zad7 extends App {


  val a : Option[Double] = CommonData.SklepOsiedlowy.get("Bułka pyszna")
  val b : Option[Double] = CommonData.SklepOsiedlowy.get("Bulka")

  println(a.toString)
  println(b.toString + "Program nie zakończył się błędem")

    CommonData.SklepOsiedlowy.foreach(x=>println("Cena towaru "+x._1+": "
      +show(CommonData.SklepOsiedlowy.get(x._1))))
  println("Cena towaru "+"Nie istniejący towar"+": "
    +show(CommonData.SklepOsiedlowy.get("Nie istniejący towar")))

  def show(x: Option[Double]) = x  match {
    case None => "?"
    case default => x.toString
  }
}

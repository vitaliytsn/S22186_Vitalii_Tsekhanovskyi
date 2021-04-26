package example

object Zad5 extends  App {
  var sklepikPromocja = scala.collection.mutable.Map[String, Double]()
  CommonData.SklepOsiedlowy foreach {t=>sklepikPromocja addOne(t._1,t._2*0.9)}
  println(sklepikPromocja)
}

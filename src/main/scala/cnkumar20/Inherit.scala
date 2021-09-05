package cnkumar20
import scala.collection.mutable.ListBuffer


class Animal(name:String,age:Int) {
  var inJungle = ListBuffer[String]()
  val fun = (a:String) => {
      a.substring(3)
  }
  def putInJungle(): String = {
    inJungle += ("Animal","Birds")
    return inJungle.reduce((a, b) =>fun(a) + fun(b))
  }
  def getJungle():ListBuffer[String] = {
    return inJungle
  }
}


object Inherit extends App {
  val cat:Animal = new Animal("pussy",1)
  println(cat.putInJungle())
}
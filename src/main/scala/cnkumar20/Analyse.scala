package cnkumar20
import util.{Home, Human}
import org.apache.spark.sql.SparkSession

object Analyse extends App {
    val multiply = (i: Int,j: Int) => i*j
    println("multiplier " + multiply(4,6))
    val nandy:Home = new Human()
    nandy.play()
    val map:Map[Char,Int] = Map()
    var list: List[Int] = List(1, 23, 5)
    list.+:(4)
    //Closure concepts tagged with patternmatch
    val m = (x:String) => x match {
      case "1" => "One"
      case _ => "Any"
    }
    println(m("1"))
}

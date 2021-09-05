package cnkumar20
import org.apache.spark.sql.SparkSession
object sparkApp extends App {
  val spark = SparkSession
    .builder()
    .config("spark.master", "local")
    .config("spark.dynamicAllocation.enabled","false")
    .appName("jsonReaderApp")
    .enableHiveSupport()
    .getOrCreate()
import spark.implicits._
  import spark.sql
  // For implicit conversions like converting RDDs to DataFrames
  import spark.implicits._
  val df = spark.read.json("data/people.json")
  println(df.show(2))
  //df.name
}

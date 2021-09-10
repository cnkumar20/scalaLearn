package cnkumar20.leetcode
import scala.collection.mutable.ListBuffer
class Leetcode {

  def problemStatement(problem: Int): String = {
    problem match {
      case 1 => println(1)
      case _ => println(2)
    }
    return "executed"
  }

  def maxPosition(timeList: Array[Int]): Array[Int] = {
    //time = (9,29,39,59,60)
    //keys = (abcde)
    var tempArray = new Array[Int](timeList.length)
    var beg = 0
    for (i <- 0 to tempArray.length) {
      tempArray(i) = timeList(i) - beg
      beg = timeList(i)
    }
    val pos = tempArray.zipWithIndex.filter(_._1 == tempArray.max)
    pos.map(_._2.toInt).toArray
  }

  def LongestKeyPressed(inputKeys: List[Char], timeList: Array[Int]): Char = {
    val postArray = maxPosition(timeList)
    val c = postArray.map(inputKeys(_))
    c.max
  }

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var sumMap = Map[Int,Int]()
    for(x <- 0 to nums.size-1) {
      if(!sumMap.contains(nums(x))) {
        sumMap += (target-nums(x) -> x)
      }
      else {
        return Array(sumMap(nums(x)),x)
      }
    }
    return Array()
  }
}

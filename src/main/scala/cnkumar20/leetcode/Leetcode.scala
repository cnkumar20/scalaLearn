package cnkumar20.leetcode

class Leetcode {

  def problemStatement(problem:Int):String = {
    problem match {
      case 1=> println(1)
      case _=> println(2)
    }
    return "executed"
  }

  def maxPosition(timeList:Array[Int]):Array[Int] = {
    //time = (9,29,39,59,60)
    //keys = (abcde)
    var arrTime = Array(timeList.length)
    var posList = List[Int]()
    var beg = 0
    for(i <- 0 to arrTime.length) {
      arrTime(i) = timeList(i) - beg
      beg = timeList(i)
    }
    val temp = arrTime.zipWithIndex.filter(_._1==arrTime.max)
    for(x <- 0 to temp.length) {
      posList += temp(0)._1.toString
    }
    return posList.toArray
  }
  def LongestKeyPressed(inputKeys:List[String],timeList:Array[Int]):String = {
    val maxPosition(timeList)
    return "asdf"
  }


}

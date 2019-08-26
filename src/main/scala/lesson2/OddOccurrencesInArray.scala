package lesson2

object OddOccurrencesInArray {
  //https://app.codility.com/demo/results/training6UPM7Y-KC7/
  def solution(a: Array[Int]): Int = {
    a.foldLeft(Map[Int,Int]().withDefaultValue(0)){
      (acc, key) => if(acc.contains(key)) acc - key else acc + (key -> acc(key))
    }.keySet.head
  }

  //88% -> TIMEOUT ERROR発生のため修正が必要
  //https://app.codility.com/demo/results/training5WJ5HG-PXS/
  //def solution(a: Array[Int]): Int = {
  //  a.groupBy(x => x).filter(_._2.length % 2 == 1).keySet.headOption match {
  //    case Some(x) => x
  //    case None => 0
  //  }
  //}
}

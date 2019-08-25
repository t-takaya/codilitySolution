package lesson2

object OddOccurrencesInArray {
  //88% -> TIMEOUT ERROR発生のため修正が必要
  //https://app.codility.com/demo/results/training5WJ5HG-PXS/
  def solution(a: Array[Int]): Int = {
    a.groupBy(x => x).filter(_._2.length % 2 == 1).keySet.headOption match {
      case Some(x) => x
      case None => 0
    }
  }
}

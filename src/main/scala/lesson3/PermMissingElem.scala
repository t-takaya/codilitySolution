package lesson3

object PermMissingElem {
  //https://app.codility.com/demo/results/trainingN3RFH9-92M/
  def solution(a: Array[Int]): Int = {
    if(a.isEmpty) return 1

    val numSum = (1 to a.length + 1).sum
    numSum - a.sum
  }
}

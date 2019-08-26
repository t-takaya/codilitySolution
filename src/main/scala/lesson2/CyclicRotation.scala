package lesson2

object CyclicRotation {
  //https://app.codility.com/demo/results/trainingA9H839-ABB/
  def solution(a: Array[Int], k: Int): Array[Int] = {
    val rotationIndex = if (a.isEmpty || k == 0) {
      0
    } else if (a.length < k) {
      k % a.length
    } else {
      k
    }
    a.takeRight(rotationIndex) ++ a.take(a.length - rotationIndex)
  }
}

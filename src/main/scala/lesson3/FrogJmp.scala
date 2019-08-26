package lesson3

object FrogJmp {
  //https://app.codility.com/demo/results/trainingKZBPMQ-AC9/
  def solution(x: Int, y: Int, d: Int): Int = {
    val diff = y - x
    val jumpCount = diff / d
    if(diff % d == 0) jumpCount else jumpCount + 1
  }
}

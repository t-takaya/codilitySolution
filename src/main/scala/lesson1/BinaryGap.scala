package lesson1

object BinaryGap {
  def solution(n: Int): Int = {
    if(n == 0) return 0

    val binaryString = Integer.toBinaryString(n)
    val dropIndex = if(n % 2 == 0) 1 else 0
    val zeroList = binaryString.split("1").dropRight(dropIndex)

    val max = if(!zeroList.isEmpty) { zeroList.max.length } else { 0 }
    max
  }
}

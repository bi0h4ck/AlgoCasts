package Solution

import org.scalatest.funsuite.AnyFunSuite

class ChunkTest extends AnyFunSuite {
  test("chunk divides an array of 10 elements with chunk size 2") {
    val array = Array.range(1, 11)
    val result = Array(Array(1, 2), Array(3, 4), Array(5, 6), Array(7, 8), Array(9, 10))
    assert(SolutionList.chunk(array, 2) === result)
  }

  test("chunk divides an array of 3 elements with chunk size 1") {
    val array = Array(1, 2, 3)
    val result = Array(Array(1), Array(2), Array(3))
    assert(SolutionList.chunk(array, 1) === result)
  }

  test("chunk divides an array of 5 elements with chunk size 3") {
    val array = Array.range(1, 6)
    val result = Array(Array(1, 2, 3), Array(4, 5))
    assert(SolutionList.chunk(array, 3) === result)
  }

  test("chunk divides an array of 13 elements with chunk size 5") {
    val array = Array.range(1, 14)
    val result = Array(Array(1, 2, 3, 4, 5), Array(6, 7, 8, 9, 10), Array(11, 12, 13))
    assert(SolutionList.chunk(array, 5) === result)
  }
}

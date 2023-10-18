package Solution

import org.scalatest.funsuite.AnyFunSuite

class MatrixTest extends AnyFunSuite {
  test("matrix produces a 2x2 array") {
    val m = SolutionList.matrix(2)
    assert(m.length == 2)
    assert(m(0) === Array(1, 2))
    assert(m(1) === Array(4, 3))
  }

  test("matrix produces a 3x3 array") {
    val m = SolutionList.matrix(3)
    assert(m.length == 3)
    assert(m(0) === Array(1, 2, 3))
    assert(m(1) === Array(8, 9, 4))
    assert(m(2) === Array(7, 6, 5))
  }

  test("matrix produces a 4x4 array") {
    val m = SolutionList.matrix(4)
    assert(m.length == 4)
    assert(m(0) === Array(1, 2, 3, 4))
    assert(m(1) === Array(12, 13, 14, 5))
    assert(m(2) === Array(11, 16, 15, 6))
    assert(m(3) === Array(10, 9, 8, 7))
  }

  test("matrix produces a 6x6 array") {
    val m = SolutionList.matrix(6)
    assert(m.length == 6)
    assert(m(0) === Array(1, 2, 3, 4, 5, 6))
    assert(m(1) === Array(20, 21, 22, 23, 24, 7))
    assert(m(2) === Array(19, 32, 33, 34, 25, 8))
    assert(m(3) === Array(18, 31, 36, 35, 26, 9))
    assert(m(4) === Array(17, 30, 29, 28, 27, 10))
    assert(m(5) === Array(16, 15, 14, 13, 12, 11))
  }
}

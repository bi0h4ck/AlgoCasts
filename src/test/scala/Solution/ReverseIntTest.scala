package Solution
import org.scalatest.funsuite.AnyFunSuite

class ReverseIntTest extends AnyFunSuite {
  test("ReverseInt handles 0 as an input") {
    assert(SolutionList.reverseInt(0) == 0)
  }

  test("ReverseInt flips a positive number") {
    assert(SolutionList.reverseInt(5) == 5)
    assert(SolutionList.reverseInt(15) == 51)
    assert(SolutionList.reverseInt(90) == 9)
    assert(SolutionList.reverseInt(2359) == 9532)
  }

  test("ReverseInt flips a negative number") {
    assert(SolutionList.reverseInt(-5) == -5)
    assert(SolutionList.reverseInt(-15) == -51)
    assert(SolutionList.reverseInt(-90) == -9)
    assert(SolutionList.reverseInt(-2359) == -9532)
  }

}

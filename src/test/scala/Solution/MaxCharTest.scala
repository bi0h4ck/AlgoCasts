package Solution
import org.scalatest.funsuite.AnyFunSuite

class MaxCharTest extends AnyFunSuite {
  test("Finds the most frequently used char") {
    assert(SolutionList.maxChar("a") === "a")
    assert(SolutionList.maxChar("abcdefghijklmnaaaaa") === "a")
  }

  test("Works with numbers in the string") {
    assert(SolutionList.maxChar("ab1c1d1e1f1g1") === "1")
  }
}

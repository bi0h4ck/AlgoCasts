package Solution

import org.scalatest.funsuite.AnyFunSuite

class ReverseStringTest extends AnyFunSuite {
  test("Reverse reverses a string") {
    assert(SolutionList.reverse("hello") === "olleh")
  }

  test("Reverse reverses a string with space") {
    assert(SolutionList.reverse("  abcd") === "dcba  ")
  }

  test("Reverse Empty string") {
    assert(SolutionList.reverse("") === "")
  }
}

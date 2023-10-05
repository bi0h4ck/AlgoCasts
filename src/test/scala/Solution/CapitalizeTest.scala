package Solution

import org.scalatest.funsuite.AnyFunSuite

class CapitalizeTest extends AnyFunSuite {
  test("Capitalize the first letter of every word in a sentence") {
    assert(SolutionList.capitalize("hi there, how is it going?") == "Hi There, How Is It Going?")
    assert(SolutionList.capitalize("I love breakfast at la provence.") == "I Love Breakfast At La Provence.")
  }

}

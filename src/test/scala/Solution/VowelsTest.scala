package Solution

import org.scalatest.funsuite.AnyFunSuite

class VowelsTest extends AnyFunSuite {
  test("returns the number of vowels used in 'aeiou'") {
    assert(SolutionList.vowels("aeiou") == 5)
  }

  test("returns the number of vowels used in 'AEIOU'") {
    assert(SolutionList.vowels("AEIOU") == 5)
  }

  test("returns the number of vowels used in 'abcdefghijklmnopqrstuvwxyz'") {
    assert(SolutionList.vowels("abcdefghijklmnopqrstuvwxyz") == 5)
  }

  test("returns the number of vowels used in 'bcdfghjkl'") {
    assert(SolutionList.vowels("bcdfghjkl") == 0)
  }


}

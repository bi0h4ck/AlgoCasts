package Solution
import org.scalatest.funsuite.AnyFunSuite

class PalindromeTest extends AnyFunSuite {
  test("'aba' is a palindrome") {
    assert(SolutionList.palindrome("aba") == true)
  }

  test("' ' is a palindrome") {
    assert(SolutionList.palindrome(" ") == true)
  }

  test("'aba ' is not a palindrome") {
    assert(SolutionList.palindrome("aba ") == false)
  }

  test("' aba' is not a palindrome") {
    assert(SolutionList.palindrome(" aba") == false)
  }

  test("'greetings' is not a palindrome") {
    assert(SolutionList.palindrome("greetings") == false)
  }

  test("'1000000001' is a palindrome") {
    assert(SolutionList.palindrome("1000000001") == true)
  }

  test("'Fish hsif' is not a palindrome"){
    assert(SolutionList.palindrome("Fish hsif") == false);
  }

  test("'race a car' is not a palindrome") {
    assert(SolutionList.palindrome("race a car") == false);
  }

}

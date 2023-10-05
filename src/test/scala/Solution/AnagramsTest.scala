package Solution

import org.scalatest.funsuite.AnyFunSuite

class AnagramsTest extends AnyFunSuite {
  test(" 'hello' is an anagram of 'llohe'") {
    assert(SolutionList.anagrams("hello", "llo He") == true)
  }

  test("'Whoa! Hi!' is an anagram of 'Hi!whoa!'") {
    assert(SolutionList.anagrams("Whoa! Hi!", "Hi!Whoa") == true)
  }

  test("'One One' is not an anagram of 'One Oneo'") {
    assert(SolutionList.anagrams("One One", "One Oneo") == false)
  }

  test("'A tree, a life, a bench' is not an anagram of 'A tree, a fence, a yard'") {
    assert(SolutionList.anagrams("A tree, a life, a bench", "A tree, a fence, a yard") == false)
  }

}

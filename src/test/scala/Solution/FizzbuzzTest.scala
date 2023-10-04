package Solution

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.must.Matchers

import java.io.ByteArrayOutputStream

class FizzbuzzTest  extends AnyFunSuite with Matchers {
  test("Calling fizzbuzz with 5 prints out the correct values") {
    val stream = new ByteArrayOutputStream()
    val result =
    """1
    |2
    |fizz
    |4
    |buzz""".stripMargin
    Console.withOut(stream) {
      SolutionList.fizzbuzz(5)
    }
    assert(stream.toString.contains(result))
  }

  test("Calling fizzbuzz with 15 prints out the correct values") {
    val stream = new ByteArrayOutputStream()
    val result =
      """1
        |2
        |fizz
        |4
        |buzz
        |fizz
        |7
        |8
        |fizz
        |buzz
        |11
        |fizz
        |13
        |14
        |fizzbuzz""".stripMargin
    Console.withOut(stream) {
      SolutionList.fizzbuzz(15)
    }
    assert(stream.toString.contains(result))
  }
}

package Solution

import org.scalatest.funsuite.AnyFunSuite

import java.io.ByteArrayOutputStream

class StepTest extends AnyFunSuite {
  test("step is called with n = 1") {
    val stream = new ByteArrayOutputStream()
    val result = "#"
    Console.withOut(stream) {
      SolutionList.step(1)
    }
    assert(stream.toString.contains(result))
  }

  test("step is called with n = 2") {
    val stream = new ByteArrayOutputStream()
    val result = "# \n##"
    Console.withOut(stream) {
      SolutionList.step(2)
    }
    assert(stream.toString.contains(result))
  }

  test("step is called with n = 3") {
    val stream = new ByteArrayOutputStream()
    val result = "#  \n## \n###"
    Console.withOut(stream) {
      SolutionList.step(3)
    }
    assert(stream.toString.contains(result))
  }

}

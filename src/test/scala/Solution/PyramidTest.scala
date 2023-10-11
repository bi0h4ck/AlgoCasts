package Solution

import org.scalatest.funsuite.AnyFunSuite

import java.io.ByteArrayOutputStream

class PyramidTest extends AnyFunSuite {
  test("print a pyramid for n = 2") {
    val stream = new ByteArrayOutputStream()
    val result = " # \n###"
    Console.withOut(stream) {
      SolutionList.pyramid(2)
    }
    assert(stream.toString.contains(result))
  }

  test("print a pyramid for n = 3") {
    val stream = new ByteArrayOutputStream()
    val result = "  #  \n ### \n#####"
    Console.withOut(stream) {
      SolutionList.pyramid(3)
    }
    assert(stream.toString.contains(result))
  }

  test("print a pyramid for n = 4") {
    val stream = new ByteArrayOutputStream()
    val result = "   #   \n  ###  \n ##### \n#######"
    Console.withOut(stream) {
      SolutionList.pyramid(4)
    }
    assert(stream.toString.contains(result))
  }

}

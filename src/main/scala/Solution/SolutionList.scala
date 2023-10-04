package Solution

import scala.annotation.tailrec
import scala.collection.mutable.HashMap

object SolutionList {

  /*
  Given a string, return a new string with the reversed order of characters.

  Examples:

  reverse('apple') === 'leppa'
  reverse('hello') === 'olleh'
  reverse('Greetings!') === '!sgniteerG'
   */
  def reverse(s: String): String = s.foldRight("")((c, result) => result :+ c)
  /*
  def reverse(s: String): String = s.split("").reduceRight((c, result) => result + c).toString
  */

  /*
   Given a string, return true if the string is a palindrome or false if it is not.  Palindromes are strings that form the same word if it is reversed.

   *Do* include spaces and punctuation in determining if the string is a palindrome.

   Examples:

   palindrome("abba") === true
   palindrome("abcdefg") === false
    */
  def palindrome(s: String): Boolean = {
    val size = s.length
    for( i <- 0 until size/2 ) {
      if(s(i) != s(size - i - 1))
        return false
    }
    true
  }

  /*
  Given an integer, return an integer that is the reverse ordering of numbers.

  Examples:

  reverseInt(15) === 51;
  reverseInt(981) === 189;
  reverseInt(500) === 5;
  reverseInt(-15) === -51;
  reverseInt(-90) === -9;
   */
  def reverseIntHelper(result: Int, current: Int): Int = {
    if(current == 0) return result
    reverseIntHelper(result*10 + current%10, current/10)
  }
  def reverseInt(n: Int): Int = reverseIntHelper(0, n)

/*  Alternative solution
  def reverseInt(n: Int): Int = {
    n.toString.foldRight("")((c, result) => {
      if (c == '-') c +: result
      else result :+ c
    }).toInt
   }
*/

  /*
  Given a string, return the character that is most commonly used in the string.

  Examples:

   maxChar("abcccccccd") === "c"
   maxChar("apple 1231111") === "1"
   */
  def maxChar(s: String): String =
    s.foldRight(HashMap[Char, Int]())((char, map) => map += (char -> (map.getOrElse(char, 0) + 1))).maxBy(_._2)._1.toString

  /*
  Write a program that console logs the numbers from 1 to n.

  For multiples of three print 'fizz' instead of the number

  For the multiples of five print 'buzz'

  For numbers which are multiples of both three and five print 'fizzbuzz'
  */

  def fizzbuzz(n: Int): Unit = {
    def dividedBy3(num: Int): Boolean = num % 3 == 0
    def dividedBy5(num: Int): Boolean = num % 5 == 0

    for (i <- 1 to n ) {
      (dividedBy3(i), dividedBy5(i)) match {
        case (true, false) => println("fizz")
        case (true, true) => println("fizzbuzz")
        case (false, true) => println("buzz")
        case _ => println(i)
      }
    }
  }

  /*
  Given an array and chunk size, divide the array into many subarrays where each subarray is of the provided size.

  Examples:

   // Chunk size two:
   chunk([1, 2, 3, 4], 2) --> [[ 1, 2], [3, 4]]

   // Chunk size two:
   chunk([1, 2, 3, 4, 5], 2) --> [[ 1, 2], [3, 4], [5]]

   // Chunk size 3:
   chunk([1, 2, 3, 4, 5, 6, 7, 8], 3) --> [[ 1, 2, 3], [4, 5, 6], [7, 8]]

   // Chunk size 4:
   chunk([1, 2, 3, 4, 5], 4) --> [[ 1, 2, 3, 4], [5]]

   // Chunk size 10:
   chunk([1, 2, 3, 4, 5], 10) --> [[ 1, 2, 3, 4, 5]]
  */
  //take the first n element and return them in an array


  def chunk(array: Array[Int], size: Int): Array[Array[Int]] = {
    @tailrec
    def chunkHelper(result: List[Array[Int]], current: Array[Int]): List[Array[Int]] = {
      if (current.isEmpty) result
      else {
        val (chunk, remaining) = current.splitAt(size)
        chunkHelper(result :+ chunk, remaining)
      }
    }

    chunkHelper(List[Array[Int]](), array).toArray
  }

  /* Alternative solution
  def chunk(array: Array[Int], size: Int): Array[Array[Int]] = {
    val arrayLength = array.length
    val numOfChunk = {
      if(arrayLength % size != 0) arrayLength/size + 1
      else arrayLength/size
    }
    val result = new Array[Array[Int]](numOfChunk)
    for(i <- 0 until numOfChunk) {
      result(i) = array.slice(i * size, i * size + size)
    }
    result
  }*/

}

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
  //Iterate each character of the string starting from the right, form a new string
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
  //compare each character of the string from left to from right
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


  //take out the right digit in 'current' and add it to 'result'
  //use %10 to get the digit from the right
  //use *10 to move the accumulation to the left
  def reverseIntHelper(result: Int, current: Int): Int = {
    if(current == 0) return result
    reverseIntHelper(result*10 + current%10, current/10)
  }
  def reverseInt(n: Int): Int = reverseIntHelper(0, n)

/*  Alternative solution: convert Int to String, form a new string by adding each char from right, if it's a '-', add to the front of the result
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
  //store each char with its frequency in a HashMap
  //get the key that has the max value in the map
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

  //split the array with the given size,
  //add the chunk to the accumulated result,
  //pass the remaining to chunkHelper
  //until the remaining is empty, return the result
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

  /* Alternative solution: find a number of chunk, add the chunk sliced from the array to the result
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

  /*
  Check to see if two provided strings are anagrams of each other. One string is an anagram of another if it uses the same characters in the same quantity.

  Only consider characters, not spaces or punctuation

  Consider capital letters to be the same as lower case

  Examples:

  anagrams('rail safety', 'fairy tales') === true
  anagrams('RAIL! SAFETY!', 'fairy tales') === true
  anagrams('Hi there', 'Bye there') === false
  */

  //strip the string any non word and space and then lowercase
  //create a map of char and its frequency from the cleaned string
  //compare 2 maps
  def anagrams(s1: String, s2: String): Boolean = {
    def cleanAndCount(s: String): Map[Char, Int] = {
      val cleaned = s.replaceAll("[\\W\\s]+", "").toLowerCase
      cleaned.foldRight(Map[Char, Int]().withDefaultValue(0))((char, acc) => acc + (char -> (acc(char) + 1)))
    }

    val charCount1 = cleanAndCount(s1)
    val charCount2 = cleanAndCount(s2)
    charCount1.equals(charCount2)
  }

    /* Organize the code in a different way
    def anagrams(s1: String, s2: String): Boolean = {
      def toMapOfCharInt(s: String): HashMap[Char, Int] =
        s.foldRight(HashMap[Char, Int]())((char, acc) => acc += (char -> (acc.getOrElse(char, 0) + 1)))

      def treatString(s: String): String = s.replaceAll("[\\W\\s]+", "").toLowerCase

      val treatedString1 = treatString(s1)
      val treatedString2 = treatString(s2)
      if(treatedString1.length == treatedString2.length) {
        val map1 = toMapOfCharInt(treatedString1)
        val map2 = toMapOfCharInt(treatedString2)
        map1.equals(map2)
      } else false
    }
    */

  /*
  Write a function that accepts a string. The function should capitalize the first letter of each word in the string and return the result.

  Examples:

  capitalize('a short sentence') --> 'A Short Sentence'
  capitalize('a lazy fox') --> 'A Lazy Fox'
  capitalize('look, it is working!') --> 'Look, It Is Working!'
  */
  //use regex
  def capitalize(input: String): String = {
    val pattern = "\\b\\w".r
    pattern.replaceAllIn(input, _.group(0).toUpperCase)
  }

  /* Alternative solution: take out words, put them in an array, convert first char of each word to uppercase then join them back with a space
  def capitalize(input: String): String = {
    input.split(" ").foldLeft("")((acc, word) => {
      val (firstChar, rest) = word.splitAt(1)
      acc + (firstChar.toUpperCase + rest + " ")
    }).stripTrailing
  }
  */

  /*
  Write a function that accepts a positive number N. The function should console log a step shape with N levels using the # character.
  Make sure the step has spaces on the right hand side!

  Examples

  steps(2);
  //    '# '
  //    '##'

  steps(3)
  //    '#  '
  //    '## '
  //    '###'

  steps(4)
  //    '#   '
  //    '##  '
  //    '### '
  //    '####'
  */

  def step(num: Int): Unit = {
    for(i <- 1 to num) {
      val stair = ("#" * i) + (" " * (num - i))
      println(stair)
    }
  }

  /*
  Write a function that accepts a positive number N.

  The function should console log a pyramid shape with N levels using the # character.  Make sure the pyramid has spaces on both the left *and* right hand sides.

  Examples

  pyramid(1);
  //      '#'

  pyramid(2);
  //      ' # '
  //      '###'

  pyramid(3);
  //      '  #  '
  //      ' ### '
  //      '#####'
  */

  def pyramid(n: Int): Unit = {
    val numOfCol = (2 * n) - 1
    for(i <- n to 1 by -1) {
      val numOfSpace = i - 1
      val numOfPound = numOfCol - (numOfSpace * 2)
      val step = (" " * numOfSpace) ++ ("#" * numOfPound) ++ (" " * numOfSpace)
      println(step)
    }
  }
}

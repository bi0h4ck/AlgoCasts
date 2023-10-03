package Solution

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


}

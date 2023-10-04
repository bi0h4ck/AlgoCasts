package Question

object QuestionList {
  /*
  Given a string, return a new string with the reversed order of characters.

  Examples:

  reverse('apple') === 'leppa'
  reverse('hello') === 'olleh'
  reverse('Greetings!') === '!sgniteerG'
   */
  def reverse(s: String): String = ???

  /*
  Given a string, return true if the string is a palindrome or false if it is not.  Palindromes are strings that form the same word if it is reversed.

  *Do* include spaces and punctuation in determining if the string is a palindrome.

  Examples:

  palindrome("abba") === true
  palindrome("abcdefg") === false
   */
  def palindrome(s: String): Boolean = ???

  /*
  Given an integer, return an integer that is the reverse ordering of numbers.

  Examples:

  reverseInt(15) === 51;
  reverseInt(981) === 189;
  reverseInt(500) === 5;
  reverseInt(-15) === -51;
  reverseInt(-90) === -9;
   */
  def reverseInt(n: Int): Int = ???

  /*
  Given a string, return the character that is most commonly used in the string.

  Examples:

   maxChar("abcccccccd") === "c"
   maxChar("apple 1231111") === "1"
   */
  def maxChar(s: String): String = ???

  /*
  Write a program that console logs the numbers from 1 to n.

  For multiples of three print 'fizz' instead of the number

  For the multiples of five print 'buzz'

  For numbers which are multiples of both three and five print 'fizzbuzz'
  */
  def fizzbuzz(num: Int): Unit = ???

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
  def chunk(array: Array[Int], size: Int): Array[Array[Int]] = ???

}

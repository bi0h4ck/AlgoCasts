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

  /*
  Check to see if two provided strings are anagrams of each other. One string is an anagram of another if it uses the same characters in the same quantity.

  Only consider characters, not spaces or punctuation

  Consider capital letters to be the same as lower case

  Examples:

  anagrams('rail safety', 'fairy tales') === true
  anagrams('RAIL! SAFETY!', 'fairy tales') === true
  anagrams('Hi there', 'Bye there') === false
  */
  def anagrams(s1: String, s2: String): Boolean = ???

  /*
  Write a function that accepts a string. The function should capitalize the first letter of each word in the string and return the result.

  Examples:

  capitalize('a short sentence') --> 'A Short Sentence'
  capitalize('a lazy fox') --> 'A Lazy Fox'
  capitalize('look, it is working!') --> 'Look, It Is Working!'
  */
  def captialize(s: String):String = ???

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

  def step(num: Int): Unit = ???

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

  def pyramid(n: Int): Unit = ???

  /*
  Write a function that returns the number of vowels used in a string.

  Vowels are the characters a, e, i, o, and u

  Examples

  vowels('Hi There!'); --> 3
  vowels('Why do you ask?'); --> 4
  vowels('Why?'); --> 0*/
  def vowels(input: String): Int = ???

 /*
 Write a function that accepts an integer N and returns a NxN spiral matrix.

 Examples:

 matrix(2);
 //     [[undefined, undefined],
 //      [undefined, undefined]]

 matrix(3);
 //     [[1, 2, 3],
 //      [8, 9, 4],
 //      [7, 6, 5]]

 matrix(4);
 //     [[1,   2,  3, 4],
 //      [12, 13, 14, 5],
 //      [11, 16, 15, 6],
 //      [10,  9,  8, 7]]
 */
  def matrix(n: Int): Array[Array[Int]] = ???

}

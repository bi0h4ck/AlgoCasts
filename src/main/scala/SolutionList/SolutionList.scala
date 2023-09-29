package SolutionList

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



}

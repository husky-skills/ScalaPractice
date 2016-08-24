// P06 Find out whether a list is a palindrome

object P06 extends App{
  val ls = List.range(1,10)
  println(isPalindrome(ls))
  println(isPalindrome(List(1,2,3,4,3,2,1)))
  def isPalindrome[A](list: List[A]): Boolean= list.reverse == list
}
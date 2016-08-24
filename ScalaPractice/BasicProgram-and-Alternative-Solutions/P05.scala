//P05 Reverse a list

object P05 extends App{
  val ls = List.range(1,10)
  println(reverseBuiltin(ls))
  println(reverseRecursive(ls))
  println(reverseTailRecursive(ls))
  println(reverseFunctional(ls))

  //Built in way of list reverse
  def reverseBuiltin[a] (ls:List[a]) = ls.reverse

  //Simple recursive o(n^2)
  def reverseRecursive[A](ls:List[A]):List[A] = ls match {
    case Nil => Nil
    case h :: tail => reverseRecursive(tail)::: List(h)
  }

  //Tail recursive
  def reverseTailRecursive[A](ls:List[A]):List[A] = {
    def reverseR(result:List[A], curList:List[A]):List[A] = curList match {
      case Nil => result
      case h :: tail => reverseR(h::result, tail)
    }
    reverseR(Nil, ls)
  }

  // pure functional
  def reverseFunctional[A](ls:List[A]) = ls.foldLeft(List[A]()) {(r,h) => h::r}
}
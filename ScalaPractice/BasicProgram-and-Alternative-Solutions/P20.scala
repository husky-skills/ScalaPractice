// P20 remove Kth element from list

object  P20 extends App {

  println(removeAt(1, List('a, 'b, 'c, 'd)))
  println(removeAt2(1, List('a, 'b, 'c, 'd)))

  def removeAt[A](n:Int, ls: List[A]) : List[A] = ls.take(n):::ls.drop(n+1)
  def removeAt2[A](n:Int, ls: List[A]) : List[A] = ls.splitAt(n) match {
    case (pre, post) => pre ::: post.tail
  }
}
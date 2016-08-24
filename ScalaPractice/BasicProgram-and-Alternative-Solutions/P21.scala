//P21 Insert at location

object P21 extends App {

  println(insertAt('new, 2, List('a,'b, 'c,'d)))

  //Insert function

  def insertAt[A](ne:A, n:Int, ls:List[A]):List[A] = ls.splitAt(n) match {
    case (pre, post) => pre::: List(ne) ::: post
  }
}
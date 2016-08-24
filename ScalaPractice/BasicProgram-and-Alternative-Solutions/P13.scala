// P13 (**) Run-length encoding of a list (direct solution).
//     Implement the so-called run-length encoding data compression method
//     directly.  I.e. don't use other methods you've written (like P09's
//     pack); do all the work directly.
//

object P13 extends App{
  println(encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

  def encodeDirect[A](ls:List[A]):List[(Int,A)] =
    if(ls.isEmpty)  Nil
    else  {
      val (packed, next) = ls span {_ == ls.head}
      (packed.length, packed.head):: encodeDirect(next)
    }
}

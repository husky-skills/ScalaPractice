// P08 Eliminate consecutive duplicates of list elements

object P08 extends  App{

  val ls = List('a, 'a, 'a, 'a, 'b, 'b','c,'c, 'a, 'a, 'd, 'd , 'e)

  println(compressRecursive(ls))
  println(compressTailRecursive(ls))
  println(compressFunctional(ls))

  //Standared recursive
  def compressRecursive[A](ls:List[A]):List[A] = ls match{
    case Nil => Nil
    case h :: tail => h :: compressRecursive(tail.dropWhile((x) => x==h))
  }

  //tail recursive
  def compressTailRecursive[A](ls:List[A]):List[A] = {
    def compressR(result: List[A], curList: List[A]):List[A] = curList match {
      case Nil => result
      case h :: tail => compressR(result ::: List(h), tail.dropWhile(_==h))
    }
    compressR(Nil, ls)
  }

  //Functional

  def compressFunctional[A](ls : List[A]): List[A] =
    ls.foldRight(List[A]()) {(h,r) =>
    if(r.isEmpty || r.head !=h ) h::r
    else r
    }
}
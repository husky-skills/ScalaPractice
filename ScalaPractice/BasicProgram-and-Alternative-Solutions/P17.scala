// P17 (*) Split a list into two parts.
//     scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//     res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))


object P17 extends App{
  val ls = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)

  println(splitBuiltin(4,ls))
  println(splitRecursive(4,ls))
  println(splitTailRecursive(4,ls))
  println(splitFunctional(4,ls))

  //Builtin spilt
  def splitBuiltin[A](n:Int,ls:List[A]):(List[A],List[A]) = ls.splitAt(n)

  // Recursive Split
  def splitRecursive[A](n:Int, ls:List[A]) : (List[A],List[A]) = (n,ls) match {
      case (_, Nil) => (Nil,Nil)
      case (0,post) => (Nil,post)
      case (i, h :: tail) =>{
        val (pre, post) = splitRecursive(i-1, tail)
        (h::pre,post)
      }
    }


  //Tail Recursive Split
  def splitTailRecursive[A](n:Int,ls:List[A]):(List[A],List[A]) = {
    def splitR[A](i:Int, pre: List[A], post:List[A]):(List[A],List[A]) = (i,post) match {
      case (_ , Nil) => (pre.reverse, post)
      case (0, post) => (pre.reverse, post)
      case (i , h::tail) => splitR(i-1, h::pre,tail)
    }
    splitR(n,Nil, ls)
  }

  //Functional
  def splitFunctional[A](n:Int, ls: List[A]):(List[A],List[A]) = (ls.take(n), ls.drop(n))
}
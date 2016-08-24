//P16 Drop every Nth element from a list

object P16 extends App{
  println(dropRecursive(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  println(dropTailRecursive(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  println(dropFunctional(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

  // Recursive
  def dropRecursive[A](n:Int, ls:List[A]):List[A] = {
    def dropR(i:Int, ls:List[A]):List[A] = (i,ls) match {
      case (_, Nil) => Nil
      case (1, _::tail) => dropR(n,tail)
      case(_, h::tail) => h::dropR(i-1,tail)
    }
    dropR(n,ls)
  }

  //tail Recursive version
  def dropTailRecursive[A](n:Int, ls:List[A]):List[A] ={
    def dropR(result:List[A], i:Int, curList:List[A]):List[A] = (i,curList) match {
      case(_, Nil) => result
      case (1, _:: tail) => dropR(result,n,tail)
      case(_, h:: tail) => dropR(result ::: List(h), i-1, tail)
    }
    dropR(Nil, n, ls)
  }

  //pure functional
  def dropFunctional[A](n:Int, ls: List[A]):List[A] =
    ls.zipWithIndex filter{v => (v._2+1) %n !=0} map(v => v._1)
}
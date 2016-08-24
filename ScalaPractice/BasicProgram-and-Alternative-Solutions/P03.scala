// P03 Find the Kth element of list


object P03 extends App {
  val ls = List(1,2,3,4,5,6,7,8,9,10)


  println(nthBuiltin(2, ls))
  println(nthRecursive(2, ls))

  def nthBuiltin(i: Int, ls: List[Int]): Any =
    if (i >= 0) ls(i)
    else throw new NoSuchElementException


  def nthRecursive(i: Int, ls: List[Int]): Any = (i,ls) match {
    case(0, x ::_ ) => x
    case (n,_:: tail) => nthRecursive(n - 1, tail)
    case(_ , Nil) => throw new NoSuchElementException
  }

}
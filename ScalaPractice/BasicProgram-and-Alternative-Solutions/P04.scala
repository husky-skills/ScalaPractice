//P04 Find the number of elements of a list.

object P04 extends App{
  val ls = List.range(1,10)
  println(lengthBuiltin(ls))
  println(lengthRecursive(ls))
  println(lengthTailRecursive(ls))
  println(lengthFunctional(ls))
  //Builtin
  def lengthBuiltin[A](ls: List[A])= ls.length

  //Simple Recursive solution
  def lengthRecursive[A](ls:List[A]):Int = ls match {
    case Nil => 0
    case _ :: tail => 1 + lengthRecursive(tail)
  }

  // tail recursive solution
  def lengthTailRecursive[A](ls: List[A]):Int = {
     def lenghtR(result:Int, curList: List[A]):Int = curList match{
       case Nil => result
       case _ :: tail => lenghtR(result +1 , tail)
     }
      lenghtR(0, ls)
  }

  // Pure functional solution

  def lengthFunctional[A](ls:List[A]):Int = ls.foldLeft(0){(c,_) => c+1}


}
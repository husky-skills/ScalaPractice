
// P01 Find the last element of list

object  P01 extends App{
 var ls = List( 1,2,3,4,5,6,7,8,9,10)

  println(lastBuiltin(ls))
  println(lastRecursive(ls))


  // Using built in functionality of list
  def lastBuiltin[A](ls:List[A]): A = {
    ls.last
  }

  //The standard functional approach is to recurse down the list until we hit the end
  def lastRecursive[A](ls:List[A]):A = ls match{
    case h :: Nil => h
    case _ :: tail => lastRecursive(tail)
    case _ => throw new NoSuchElementException
  }
}

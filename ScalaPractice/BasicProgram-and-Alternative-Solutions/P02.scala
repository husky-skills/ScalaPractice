//P02 find last but one element of a list

object P02 extends App{
  var ls = List(1,2,3,4,5,6,7,8,9,10)
  println(penultymateBuiltin(ls))
  println(penultymateRecursive(ls))
  println( lastNthBuiltin(2, ls))
  println(lastNthRecursive(2 , ls))

  // Builtin functions
  def penultymateBuiltin[A](ls:List[A]):A = {
    if(ls.isEmpty) throw new NoSuchElementException
    else ls.init.last
  }
  def penultymateRecursive[A](ls:List[A]):A = ls match {
    case h :: _ :: Nil => h
    case _:: tail => penultymateRecursive(tail)
    case _ => throw new NoSuchElementException
  }


  // Just for fun, let's look at making a generic lastNth function

  // An obvious modification of the builtin solutions works
  def lastNthBuiltin[A](n:Int, ls:List[A]): A = {
    if(n<=0) throw new NoSuchFieldException
    if(ls.length < n ) throw new NoSuchElementException
    ls.takeRight(n).head
  }
  // Anotherf one using non Builtin
  def lastNthRecursive[A](n:Int, ls:List[A]):A = {
    def lastNthR(count: Int, resultList:List[A], curList:List[A]): A =
      curList match {
        case Nil if count>0 => throw new NoSuchElementException
        case Nil            => resultList.head
        case _ :: tail      =>
          lastNthR(count - 1 ,
              if(count > 0) resultList else resultList.tail, tail)
      }
      if(n <=0) throw new IllegalArgumentException
      else lastNthR(n,ls,ls)
    }

}
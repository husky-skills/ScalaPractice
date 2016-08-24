// P15 Duplicate the elements of list   a given nubmer of times
// make funcstion is not supported in this version of scala
// using won make function

object P15 extends App{
  println(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))

  def duplicateN[A](n:Int, ls:List[A]):List[Any] ={
    def make[A](n:Int, e:A):List[A] = n match{
      case 0 => Nil
      case i :Int => e :: make(i-1,e)
    }
    ls.flatMap { make(n,_)}
    //ls.map(make(n,_))
  }
}
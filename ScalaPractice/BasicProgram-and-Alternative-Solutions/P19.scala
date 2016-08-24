// P19 (**) Rotate a list N places to the left.
//     Examples:
//     scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//     res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
//
//     scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//     res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)


object P19 extends App{
  println(rotate(3,List.range(1,11)))
  println(rotate(-3,List.range(1,11)))


  //First defination
  def rotate[A]( n:Int, ls:List[A]):List[A] = {
    var shift  = n % ls.length
    if ( n < 0)
      shift = ls.length + shift
    ls.drop(shift):::ls.take(shift)
  }
}
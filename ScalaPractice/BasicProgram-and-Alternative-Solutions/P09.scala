//P09 Pack consecutive duplicates of list elements in to sublist

object P09 extends App{
  val ls = List('a, 'a, 'a, 'a, 'b, 'b,'c,'c, 'a, 'a, 'd, 'd , 'e)
  println(pack(ls))
println(packRecursive(ls))
  def pack[A]( ls : List[A]):List[List[A]] = {
    if(ls.isEmpty) List(List())
    else{
      val (packed, next) = ls.span{_== ls.head}
      if(next == Nil) List(packed)
      else packed::pack(next)
    }
  }
  def packRecursive[A](ls:List[A]):List[List[A]] = ls match {
    case Nil => Nil
    case h:: tail => (h :: tail.takeWhile(_ == h) ) :: packRecursive( tail.dropWhile(_==h))
  }
}
// P14 Just duplicate list element

object P14 extends App{
  val ls = List('a, 'b, 'c, 'c, 'd)
  println(duplicate(ls))

  def duplicate[A](ls:List[A]): List[Any] = {
    ls.map( e => List(e,e))
  }
}
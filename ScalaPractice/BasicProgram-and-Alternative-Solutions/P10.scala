//P10 Run length encoding of a list
object P10 extends App {
  val ls = List('a, 'a, 'a, 'a, 'b, 'b, 'c, 'c, 'a, 'a, 'd, 'd, 'e)
  println(encode(ls))

  import P09.pack
  def encode[A](ls: List[A]): List[(Int, A)] =
    pack(ls) map { e => (e.length, e.head) }
}

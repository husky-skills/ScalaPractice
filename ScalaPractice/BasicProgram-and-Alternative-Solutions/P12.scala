// P12 Decode a run-length encoded list

object P12 extends App{
  val ls = List((4,'a), (3,'b), (2,'c), (2,'a), (2,'d), (1,'e))

  println(decode(ls))

  def decode[A](ls: List[(Int,A)]): List[Any] = {
    def make[A](e:(Int,A)): List[Any] = {
      if(e._1== 0) Nil
      else{
      make((e._1-1, e._2)):::List(e._2)
      }
    }
    ls flatMap { e => make(e)}
  }
}
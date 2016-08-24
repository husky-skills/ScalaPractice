// P11 Modify run-length of encoding
// Modify in such way that for one element only element should occur
// otherwise with count of lement

object P11 extends App{
  val ls = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'd, 'e)
  println(encodeModified(ls))
  println(encodeModified2(ls))

  import P10.encode

  //More typesafe version
  def encodeModified[A](ls:List[A]):List[Either[A,(Int,A)]] =
    encode(ls).map{t => if(t._1 == 1 ) Left(t._2) else Right(t)}

  def encodeModified2[A](ls:List[A]):List[Any] = {
    encode(ls) map {t => if(t._1 == 1) t._2 else t}
  }

}
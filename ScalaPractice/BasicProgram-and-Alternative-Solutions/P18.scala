import scala.collection.JavaConverters._

// P18 slice the list from until

object P18 extends App{

  println(sliceBuiltin(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  println(sliceForConstruct(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  println(sliceFunctional(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))


  //Builtin
  def sliceBuiltin[A](from:Int, until:Int, ls:List[A]):List[A] = ls.slice(from, until)


  //Using for construct
  def sliceForConstruct[A](from:Int, until:Int, ls:List[A]):List[A] ={
    ls.zipWithIndex filter { v => v._2 >= from && v._2 < until } map(v => v._1)
  }

  def sliceFunctional[A](from:Int, until:Int, ls:List[A]):List[A] =   ls drop from take until-from

}
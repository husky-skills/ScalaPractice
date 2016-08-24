//P07 Flatten a nested list structure

object P07 extends App{

  def flatten(list: List[Any]):List[Any] =
    list flatMap {
          case ms: List[_] => flatten(ms)
          case e => List(e)
        }

  val ls = flatten(List(List(1,1),2,List(3,List(5,8))))
println(ls)
}
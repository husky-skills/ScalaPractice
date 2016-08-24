// Selection sort

object SelectionSort extends App{

  var ls = List(5,3,4,2,6,8,9,1)
  println("Before sort : "+ls)
  ls = selectionSort(ls)
  println("After Sort : "+ls)


  // functional selection sort

  def selectionSort(ls:List[Int]) : List[Int] = {
    def sort(ls:List[Int], result:List[Int]):List[Int]  =  ls match {
      case Nil => result
      case h::tail =>
        selected(h, tail, Nil, result)
    }
    def selected(m:Int, tail:List[Int], tmp:List[Int], result:List[Int]):List[Int] = tail match{
      case Nil => sort(tmp,m::result)
      case h::t =>
        if (h> m) selected(h,t,m::tmp,result)
        else selected(m,t,h::tmp,result)

    }

  sort(ls, Nil);
  }
}
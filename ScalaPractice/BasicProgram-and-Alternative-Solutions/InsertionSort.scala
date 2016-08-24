

// Functional insertion sort

object InsertionSort extends App{

  var ls = List(5,3,4,2,6,8,9,1)
  println("Before sort : "+ls)
  ls = insertionSort(ls)
  println("After Sort : "+ls)


  def insertionSort(ls: List[Int]): List[Int] = {
    def sort(ls:List[Int], result:List[Int]):List[Int] = ls match {
      case h :: t => sort(t, insert(h,result))
      case Nil => result
    }

    def insert(a:Int , result:List[Int]):List[Int] = result match {
      case Nil => List(a)
      //case h::tail => if (a > h ) h :: insert(a ,tail )
      case h :: t if (a > h) => h :: insert(a, t)
      case _ =>  a:: result
    }

    sort(ls,Nil)
  }

}
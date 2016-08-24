// Quick sort example

object  QuickSort extends App {

  var ls = List(5, 3, 4, 2, 6, 8, 9, 1)
  println("Before sort : " + ls)
  ls = quickSort(ls)
  println("After Sort : " + ls)


  def quickSort[A <% Ordered[A]](list: List[A]): List[A] = {
    def sort(t: (List[A], A, List[A])): List[A] = t match {
      case (Nil, p, Nil) => List(p)
      case (l, p, g) => partitionAndSort(l) ::: (p :: partitionAndSort(g))
    }

    def partition(as: List[A]): (List[A], A, List[A]) = {
      def loop(p: A, as: List[A], l: List[A], g: List[A]): (List[A], A, List[A]) =
        as match {
          case h :: t => if (h < p) loop(p, t, h :: l, g) else loop(p, t, l, h :: g)
          case Nil => (l, p, g)
        }

      loop(as.head, as.tail, Nil, Nil)
    }

    def partitionAndSort(as: List[A]): List[A] =
      if (as.isEmpty) Nil
      else sort(partition(as))

    partitionAndSort(list)
  }
}
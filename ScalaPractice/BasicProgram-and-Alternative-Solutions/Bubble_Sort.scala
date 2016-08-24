//   Implementation of bubble sort method

object Bubble_Sort extends App {
  var ls = List(5,3,4,2,6,8,9,1)
  println("Before sort : "+ls)
  ls = bubble_sort(ls)
  println("After Sort : "+ls)



  // Implementing functional bubble sort

  def bubble_sort[A <% Ordered[A]](list: List[A]): List[A] = {

    def sort(as: List[A], bs: List[A]): List[A] =
    if (as.isEmpty) bs
    else bubble(as, Nil, bs)

    def bubble(as: List[A], zs: List[A], bs: List[A]): List[A] =
    as match {
    case h1 :: h2 :: t =>
    if (h1>h2) bubble(h1 :: t, h2 :: zs, bs)
    else bubble(h2 :: t, h1 :: zs, bs)
    case h1 :: Nil => sort(zs, h1 :: bs)
    }


    sort(list, Nil)
  }
}
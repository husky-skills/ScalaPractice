import java.util.NoSuchElementException

// Stack implementaion using List


object StackExample extends App{

  val stack = new Stack[Int]();
  stack.push(10)
  println("Just poped :"+ stack.pop)
  stack.push(20)
  stack.push(30)
  println(stack)

}

class Stack[A] {
  var lst = List.empty[A];
  def push(ele : A) ={
    lst = ele::lst
  }
  def pop:A = lst match {
    case Nil => throw new NoSuchElementException
    case h ::  tail => lst = tail; h
  }
  override
  def toString: String = {
    lst.toString
  }
}
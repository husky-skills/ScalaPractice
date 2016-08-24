// This example puts some more light on uses of foldLeft and foldRight

object FoldLeft_FoldRight_understanding extends App{

  val lst = List.range('a', 'i') // create list from containing a thorough h

  println(lst.foldLeft("Init"){_+_})  // Init is initial value passed to iteration
  println(lst.foldRight("Init")(_+_)) // The second parameter is the function

  // foldLeft passes initial value to first argument of innter function
  // and keeps storing result in left i.e first argument
  // second argument is always assigned with every individual element of list from left to right
  println(lst.foldLeft("Init")( op = (x, y) => {
    println(x); x + y
  }))
  println(lst.foldLeft("Init")((x, y)=>{println(y); x+y}))

  // foldRight passes initial value to second argument of innter function
  // and keeps storing result in right ie second argument
  // first argument is always assigned with every individual element of list from right to left
  println(lst.foldRight("Init")((x,y)=> {println(y); x+y}))
  println(lst.foldRight("Init")((x,y)=> {println(x); x+y}))


}
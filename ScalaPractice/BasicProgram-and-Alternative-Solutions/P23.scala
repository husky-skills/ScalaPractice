//class test


object P23 extends App {
  //var t  = new Test(10,20)  // With class to create object new is compulsory
  var t2  = Test(10,20)  // works with case class only. This is a companion object Test with apply() method
  var t = Test(40,50)

  println(t.a+" "+t.b)
  println(t.c+" "+t.d)

  // Lazy value testing
  var tt = new LazyValTest
  println("Value to B is not yet assigned ")
  tt.b
}

// Every field is public unless it is defined as private
case class Test(val a:Int, var b:Int){
 // default constructor roll over all call definition  allowing declaration, assignment work
  val c: Int = a
  var d: Int = b

}

class LazyValTest { // lazy is allowed with only val   - values
  val a:String ={println("Value is assigned to A"); "A"}
  lazy val b:String ={println("Value is assigned to B"); "B"}

}
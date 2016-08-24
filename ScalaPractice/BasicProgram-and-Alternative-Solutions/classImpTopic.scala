package test.classes {


  object ClassImpTopic extends App {
    //var t  = new Test(10,20)  // With class to create object new is compulsory
    var t2 = Test(10, 20)
    // works with case class only. This is a companion object Test with apply() method
    var t = Test(40, 50)

    println(t.a + " " + t.b)
    println(t.c + " " + t.d)

    // Lazy value testing
    var tt = new LazyValTest
    println("Value to B is not yet assigned ")
    tt.b


    //Constructor experiment

    var ttt = new ConstructorEx(40,50)
    var tttt = new ConstructorEx(20)
    println(ttt)
    println(tttt)


  }

  // Every field is public unless it is defined as private
  case class Test(val a: Int, var b: Int) {
    // default constructor roll over all call definition  allowing declaration, assignment work
    val c: Int = a
    var d: Int = b

  }

  class LazyValTest {
    lazy val b: String = {
      println("Value is assigned to B");
      "B"
    }
    // lazy is allowed with only val   - values
    val a: String = {
      println("Value is assigned to A");
      "A"
    }
  }
class ConstructorEx(var a:Int, val b:Int) {
  //def this(var  b:Int) = this (10, b) // you can not introduce new variable in alternate constructor
  var c = a+b
  def this(b:Int) = this(10,b) // every other constructor should call primary
  override def toString: String = " A = " +a +"  B = "+b +"  C = "+c

}
}
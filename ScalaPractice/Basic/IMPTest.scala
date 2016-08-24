// What is the size of Array ??

class Creature {
 val range: Int = 10
 // Solution2 :  lazy val range: Int = 10
val env: Array[Int] = new Array[Int](range)
msg
def msg = println("Super should be 10")
}


class Ant extends Creature {
override val range = 2  
//Solution1 :           override final val range = 2
 // Solution2 :  override lazy val range: Int = 2
override def msg = println("Child should be 2")

}


// Solution3: change class as below
//class Ant extends { override val range = 2 } with Creature 


object IMPTest extends App {
	val c = new Creature();
	println("Creature size " + c.env.length)
	val  a = new Ant();
	println("Ant size " + a.env.length)
}
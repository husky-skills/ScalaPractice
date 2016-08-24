
object XMLExample2 extends App {
	val car = new Car{
		val name = "Audi"
		val yearMade = 2016
	}
	println(car.toXML)
	
abstract	class Car {
		val name : String
		val yearMade : Int
		
		override def toString = name + " " + yearMade
		
		def toXML = <Car>
						<name> {name} </name>
						<YearMade> {yearMade} </YearMade>
					</Car>
	}
}
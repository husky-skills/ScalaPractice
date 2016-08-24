
object XMLDeserialization extends App {
	val xmlCar = <Car>
					<YearMade>2016</YearMade>
					<Name> Audi </Name>
				 </Car>
	val car = fromXML(xmlCar)
	println(car)
	
	def fromXML(xml : scala.xml.Node):Car = {
		new Car{
			val name = (xml\"Name").text
			val yearMade = (xml\"YearMade").text.toInt
		}
	}
	abstract class Car {
		val yearMade : Int
		val name 	 : String
		override def toString = name + " " + yearMade
	}
}
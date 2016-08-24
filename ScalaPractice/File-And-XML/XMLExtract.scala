

object XMLExtract extends App {
	val xml = <Person name = "Mahendra">
				<University degree = "MCA"> Pune </University>
			  </Person>
	println("******** output ************")
	println(xml.text)
	println(xml\"University")
	println(xml\"@name")
	//println(xml\"@degree")
	println(xml\"University"\"@degree")
	
}

object XMLLiterals extends App {
	val yearMade = 1992
	val xml1 = <a>	
				This is Sample tag
				With some nested tag <atag></atag>
				</a>
	val xml2 = <a> {"Hello" + "world"}  </a>
	val xml3 = <a> { if(yearMade < 2000 ) 
						<old> {yearMade} </old>
					 else  xml.NodeSeq.Empty 
					} </a>
	println(xml1)
	println(xml2)
	println(xml3)
}
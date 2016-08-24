
import scala.io.Source
import java.io.{FileNotFoundException,
				IOException}
				
object FileException extends App{
	val filename = "not-a-file"
	try {
		for(line <- Source.fromFile(filename).getLines())
			println(line)
	}
	catch {
		case ex: FileNotFoundException	 => println("File not found exception occurred")
		case ex: IOException 	 => println("IO Exception occurred")
	}
}
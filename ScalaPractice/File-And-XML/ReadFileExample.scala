
import scala.io.Source

object ReadFileExample extends App{
	val fileName = "Sample-File.txt"
	for(line <- Source.fromFile(fileName).getLines())
		println(line)
}
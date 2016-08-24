
import java.io._
object JavaFileWrite extends App {
	val writer = new PrintWriter ( new File("Test-File.txt"))
	writer.write("Writing file via scala")
	writer.close
}
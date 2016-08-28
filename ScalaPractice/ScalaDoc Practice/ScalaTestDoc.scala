package scaladoc.practice
/** ==First Heading==
  *This is simple program to run in command line 
  * and produce one line of code
  */
  
 /** ===Overview===
  * This program can simply invoked via command line 
  * as given in below example
  * {{{
  * scala ScalaTestDoc
  * This is simple program to generate scala doc
  * }}}
  *
  *
  * or via scala REPL 
  * {{{
  * scala> ScalaTestDoc
  * This is simple program to generate scala doc
  * }}}}
  * ==Class Information==
  * see more in bottom of document
  * @author Mahendra Shinde
  * @version 1.0
  */
class ScalaTestDoc {
  /** @param args Command line arguments. But does not have any implementation
    * @return returns no value
    */
	def main(args:Array[String]) =
	println("This is simple program to generate scala doc")
}
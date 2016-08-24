import scala.actors.Actor._
import scala.actors.Actor
import util.Random

object ProducerConsumerTest extends App {
	val consumer = new Consumer
	val producer = new Producer(consumer)
	
	consumer.start
	producer start
}

class Producer(c: Consumer) extends Actor{
	def act = {
		loop{
			val num = produce
			println("Sending : "+num)
			c ! SomeObject(num)
		}
	}
	def produce():Int = {
		Thread sleep 400
		val random = new Random(System nanoTime)
		return random.nextInt(100)		
	}
}

class Consumer extends Actor{
	def act = {
		loop{
			receive {
				case SomeObject(num) =>
					println("............Received : " + num)
			}
		}
	}
}

case class SomeObject(num : Int)

import scala.actors.Actor._
object ActorMailboxCount extends App{
	val myActor = actor{
		loop{
			receive {
				case "How many?" => println("Mailbox has "+mailboxSize.toString+"mail")
			}
		}
	}
	myActor ! "How many?"
	myActor ! 1 
	myActor ! 1 
	myActor ! 1 
	myActor ! "How many?"
	myActor ! "How many?"
	myActor	! 2
	myActor	! 3
	myActor ! "How many?"
	
	
}
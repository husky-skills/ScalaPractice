// SetSpec as FlatSpec style

/* A good first step for teams wishing to move from xUnit to BDD, 
  FlatSpec's structure is flat like xUnit, so simple and familiar, 
  but the test names must be written in a specification style: "X should Y," "A must B," etc. */

import org.scalatest.FlatSpec
import collection.mutable.Set 

class SetSpecAsFlatSpec extends FlatSpec{
	"A Empty Set" should "have size 0" in {
		assert(Set.empty.size == 0)
	}
	it should "Produce NoSuchElementException when head accessed" in {
		assertThrows[NoSuchElementException]{
			Set.empty.head
		}
	} 
}
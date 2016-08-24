

// SetSpec with WordSpec

/* For teams coming from specs or specs2, WordSpec will feel familiar, 
and is often the most natural way to port specsN tests to ScalaTest. 
WordSpec is very prescriptive in how text must be written, so a good fit for teams 
who want a high degree of discipline enforced upon their specification text. */

import org.scalatest.WordSpec
import collection.mutable.Set 

class SetSpecAsWordSpec extends WordSpec{
	"A Set" when {
		"Empty" should {
			"have size 0" in {
				assert(Set.empty.size == 0)
			}
			"produce NoSuchElementException when head is accessed" in{
				assertThrows[NoSuchElementException]{
					Set.empty.head
				}
			}
		}
	}
}
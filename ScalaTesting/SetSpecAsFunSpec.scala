// SetSpec as FunSpec
/*For teams coming from Ruby's RSpec tool, FunSpec will feel very familiar;
 More generally, for any team that prefers BDD, FunSpec's nesting and 
 gentle guide to structuring text (with describe and it) provides an excellent general-purpose choice 
 for writing specification-style tests.*/
 
 
 import org.scalatest.FunSpec
 import collection.mutable.Set
 
 class SetSpecAsFunSpec extends FunSpec{
	describe("A Set") {
		describe("When Empty"){
			it("should have size 0") {
				assert(Set.empty.size == 0)
			}
			it("should produce NoSuchElementException when head accessed") {
				assertThrows[NoSuchElementException]{
					Set.empty.head
				}
			}
		}
		
	}
 }
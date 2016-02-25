import spock.test.*;

class DataTableExampleSpec extends spock.lang.Specification {
  
  def "Test data table example"() {
    expect:
    	name.size() == length

    where:
	    name     | length
	    "Spock"  | 5
	    "Kirk"   | 4
	    "Scotty" | 6
  }
}  
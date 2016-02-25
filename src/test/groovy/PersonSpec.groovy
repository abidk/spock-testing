import spock.test.*;

class PersonSpec extends spock.lang.Specification {

  def "Setting a persons name should return the correct name"() {
  	setup:
  	def person = new Person();
  	
    when:
    person.setName("Abid")
    
    then:
    person.getName() == "Abid"
  }
  
  def "test"() {
    expect:
    name.size() == length

    where:
    name     | length
    "Spock"  | 5
    "Kirk"   | 4
    "Scotty" | 6
  }
}  
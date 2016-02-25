import spock.test.*;

class PublisherSpec extends spock.lang.Specification {

  def "events are received by all subscribers"() {
  	setup: "mock a couple subscribers"
		def subscriber1 = Mock(Subscriber)
		def subscriber2 = Mock(Subscriber)

	and: "create publisher"
		def publisher = new Publisher()
	
	and: "add subscribers to publisher"
		publisher.add(subscriber1)
		publisher.add(subscriber2)
  	
    when:
	    publisher.fire("Abid")
    
    then: "all subscribers should receive an event once"
		1 * subscriber1.eventReceived("Abid")
	  	1 * subscriber2.eventReceived("Abid")
  }
}  
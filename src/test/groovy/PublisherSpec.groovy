import spock.test.*;

class PublisherSpec extends spock.lang.Specification {

  def "events are received by all subscribers"() {
  	setup:
	def subscriber1 = Mock(Subscriber)
	def subscriber2 = Mock(Subscriber)

	def publisher = new Publisher()
	publisher.add(subscriber1)
	publisher.add(subscriber2)
  	
    when:
    publisher.fire("Abid")
    
    then:
	1 * subscriber1.eventReceived("Abid")
  	1 * subscriber2.eventReceived("Abid")
  }
}  
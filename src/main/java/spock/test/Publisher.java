package spock.test;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

   List<Subscriber> subscribers = new ArrayList<Subscriber>();

   public void fire(String event) {
      for (Subscriber subscriber : subscribers) {
         subscriber.eventReceived(event);
      }
   }

   public void add(Subscriber subscriber) {
      subscribers.add(subscriber);
   }

}

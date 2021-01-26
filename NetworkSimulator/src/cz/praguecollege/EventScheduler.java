package cz.praguecollege;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class EventScheduler {

    private Queue<Event> scheduledEvents;

    private static EventScheduler instance = new EventScheduler();

    public static EventScheduler getInstance(){
        return instance;
    }

    private EventScheduler(){
        scheduledEvents = new LinkedList<>();
    }

    public void addEvent(EventType type, Long timestamp) {
        scheduledEvents.offer(Event.createEvent(type, timestamp));
    }

    public Event getNextEvent() {
        return scheduledEvents.poll();
    }


}

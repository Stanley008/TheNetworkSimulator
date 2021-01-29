package cz.praguecollege;

import java.util.Comparator;
import java.util.PriorityQueue;

public class EventScheduler {

    private final PriorityQueue<Event> scheduledEvents;

    private static final EventScheduler instance = new EventScheduler();

    public static EventScheduler getInstance(){
        return instance;
    }

    private EventScheduler(){
        Comparator<Event> timestampSorter = Comparator.comparing(Event::getTime);
        scheduledEvents = new PriorityQueue<>(timestampSorter);
    }

    public void addEvent(EventType type, Long timestamp, EventReciever eventReciever) {
        scheduledEvents.offer(Event.createEvent(type, timestamp, eventReciever));
    }

    public Event getNextEvent() {
        return scheduledEvents.poll();
    }

    public void runEventScheduler() {

        while(!scheduledEvents.isEmpty()) {
            Event event = getNextEvent();
            event.getEventReciever().onEvent(event);
        }
    }

}

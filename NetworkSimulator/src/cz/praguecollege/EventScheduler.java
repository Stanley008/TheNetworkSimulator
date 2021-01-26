package cz.praguecollege;

import java.util.Queue;

public class EventScheduler {

    private Queue<Event> scheduledEvents;

    private static EventScheduler instance = new EventScheduler();

    public static EventScheduler getInstance(){
        return instance;
    }

    private EventScheduler(){}



}

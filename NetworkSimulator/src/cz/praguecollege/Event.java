package cz.praguecollege;

import java.util.HashSet;
import java.util.Set;

enum EventType {
    CHECK_UPPER_QUEUE,
    CHECK_LOWER_QUEUE
}

public class Event {
    private final EventType type;

    public static Event createEvent(EventType type){
        return new Event(type);
    }

    private Event(EventType type){
        this.type = type;
    }

    public EventType getType(){
        return type;
    }
}

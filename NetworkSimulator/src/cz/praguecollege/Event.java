package cz.praguecollege;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

enum EventType {
    CHECK_UPPER_QUEUE,
    CHECK_LOWER_QUEUE
}

public class Event {
    private final EventType type;
    private final Date time;

    public static Event createEvent(EventType type, Date time){
        return new Event(type, time);
    }

    private Event(EventType type, Date time){
        this.type = type;
        this.time = time;
    }

    public EventType getType(){
        return type;
    }

    public Date getTime(){
        return time;
    }
}

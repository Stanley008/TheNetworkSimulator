package cz.praguecollege;

import java.util.Date;

enum EventType {
    CHECK_UPPER_QUEUE,
    CHECK_LOWER_QUEUE
}

public class Event {
    private final EventType type;
    private final Long timestamp;

    public static Event createEvent(EventType type, Long timestamp){
        return new Event(type, timestamp);
    }

    private Event(EventType type, Long timestamp){
        this.type = type;
        this.timestamp = timestamp;
    }

    public EventType getType(){
        return type;
    }

    public Long getTime(){
        return timestamp;
    }
}

package cz.praguecollege;

enum EventType {
    CHECK_UPPER_QUEUE,
    CHECK_LOWER_QUEUE
}

public class Event {
    private final EventType type;
    private final Long timestamp;
    private final EventReciever eventReciever;

    public static Event createEvent(EventType type, Long timestamp, EventReciever eventReciever){
        return new Event(type, timestamp, eventReciever);
    }

    private Event(EventType type, Long timestamp,EventReciever eventReciever){
        this.type = type;
        this.timestamp = timestamp;
        this.eventReciever = eventReciever;
    }

    public EventType getType(){
        return type;
    }

    public Long getTime(){
        return timestamp;
    }

    public EventReciever getEventReciever() {return eventReciever;}
}

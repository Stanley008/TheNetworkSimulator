package cz.praguecollege;

import java.util.LinkedList;

public abstract class Protocol {
    private LinkedList<Interface> interfaces = new LinkedList<>();
    private Layer layer;

    public Protocol(Layer layer){
        this.layer = layer;
    }

    public abstract void createInterfaces();
    public abstract void handleUpperMessage();
    public abstract void handleLowerMessage();
}

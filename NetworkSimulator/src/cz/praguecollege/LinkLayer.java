package cz.praguecollege;

import java.util.LinkedList;

public class LinkLayer extends Layer implements EventReciever {
    @Override
    public void insertFromUpperLayer(Message msg) {
        // TODO what does each layer process with these methods
        // TODO other than locating interface/protocol
        // TODO the return values of these methods? void or other values
    }

    @Override
    public void insertFromLowerLayer(Message msg) {

    }

    private LinkedList<LinkInterface> linkInterfaces;
    private LinkedList<LinkProtocol> linkProtocols;

    @Override
    public void onEvent(Event event) {
        // TODO what kind of events are there
        // TODO does this send a Message to other layers?
    }
}

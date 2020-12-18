package cz.praguecollege;

import java.util.LinkedList;

public class LinkLayer implements Layer, EventReciever {
    @Override
    public void insertFromUpperLayer(Message msg) {

    }

    @Override
    public void insertFromLowerLayer(Message msg) {

    }

    private LinkedList<LinkInterface> linkInterfaces;
    private LinkedList<LinkProtocol> linkProtocols;

    @Override
    public void onEvent(Event event) {

    }
}

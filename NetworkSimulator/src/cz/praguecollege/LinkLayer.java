package cz.praguecollege;

import java.util.LinkedList;

public class LinkLayer extends Layer implements EventReciever {

    private LinkedList<LinkInterface> linkInterfaces;
    private LinkedList<LinkProtocol> linkProtocols;

    public LinkLayer(LinkedList<LinkProtocol> linkProtocols, LinkedList<Interface> phyInterfaces){
        this.linkProtocols = linkProtocols;
        for(var protocol : linkProtocols){

        }
    }

    @Override
    public void onEvent(Event event) {
        // TODO what kind of events are there
        // TODO does this send a Message to other layers?
    }
}

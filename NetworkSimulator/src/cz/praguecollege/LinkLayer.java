package cz.praguecollege;

import java.util.LinkedList;

public class LinkLayer extends Layer {

    private LinkedList<LinkProtocol> linkProtocols;

    public LinkLayer(LinkedList<LinkProtocol> linkProtocols, LinkedList<Interface> phyInterfaces){
        this.linkProtocols = linkProtocols;
        for(var protocol : linkProtocols){

        }
    }

    @Override
    public void onEvent(Event event) {

    }
}

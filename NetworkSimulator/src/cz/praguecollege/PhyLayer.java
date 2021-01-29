package cz.praguecollege;

import java.util.LinkedList;

public class PhyLayer extends Layer implements EventReciever{

    LinkedList<PhyInterface> phyInterfaces;

    public PhyLayer(LinkedList<PhyInterface> phyInterfaces){
        this.phyInterfaces = phyInterfaces;
    }

    @Override
    public void onEvent(Event event) {

    }
}

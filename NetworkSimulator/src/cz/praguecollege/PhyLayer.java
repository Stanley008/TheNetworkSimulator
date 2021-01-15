package cz.praguecollege;

import java.util.LinkedList;

public class PhyLayer extends Layer implements EventReciever{

    @Override
    public void insertFromUpperLayer(Message msg) {

    }

    @Override
    public void insertFromLowerLayer(Message msg) {

    }

    LinkedList<PhyInterface> phyInterfaces;
    // TODO what does phy interface hold (only connects to netadaptor?)

    @Override
    public void onEvent(Event event) {

    }
}

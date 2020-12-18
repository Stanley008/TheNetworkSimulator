package cz.praguecollege;

import java.util.LinkedList;

public class PhyLayer implements Layer, EventReciever{

    @Override
    public void insertFromUpperLayer(Message msg) {

    }

    @Override
    public void insertFromLowerLayer(Message msg) {

    }

    LinkedList<PhyInterface> phyInterfaces;

    @Override
    public void onEvent(Event event) {

    }
}

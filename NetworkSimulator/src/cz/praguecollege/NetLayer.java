package cz.praguecollege;

import java.util.LinkedList;

public class NetLayer implements Layer, EventReciever{
    @Override
    public void insertFromUpperLayer(Message msg) {
        int protocolID = msg.getProtocol();
        for(var protocol:netProtocols){
            if(protocol.getProtocolID() == protocolID){
                //TODO
            }
        }
    }

    @Override
    public void insertFromLowerLayer(Message msg) {
        //TODO
    }

    private LinkedList<NetInterface> netInterfaces;
    private LinkedList<NetProtocol> netProtocols;

    @Override
    public void onEvent(Event event) {

    }
}

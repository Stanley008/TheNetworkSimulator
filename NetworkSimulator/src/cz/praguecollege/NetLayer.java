package cz.praguecollege;

import java.util.LinkedList;

public class NetLayer extends Layer implements EventReciever{
    @Override
    public void insertFromUpperLayer(Message msg) {
        int protocolID = msg.getProtocol();
        for(var protocol:netProtocols){
            if (protocol.getProtocolID() == protocolID){
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

    // create message to send down to linked layer
    public LinkMessage CreateMessage(String rawData, IPAddress destinationIP) throws NonExistingIPException {
        IPAddress sourceIP;
        for (var element : netInterfaces) {
            if (element.getProtocol() == destinationIP.getProtocol()) {
                sourceIP = element.getIP();
                return new LinkMessage(sourceIP, destinationIP, rawData);
            }
        }
        throw new NonExistingIPException();
    }

    @Override
    public void onEvent(Event event) {

    }
}

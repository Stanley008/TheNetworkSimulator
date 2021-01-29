package cz.praguecollege;

import java.util.LinkedList;
import java.util.Queue;

public class NetLayer extends Layer implements EventReciever {


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
        Message msg;
        switch(event.getType()){
            case CHECK_LOWER_QUEUE:
                msg = getNextFromLowerLayer();

                break;
            case CHECK_UPPER_QUEUE:
                msg = getNextFromUpperLayer();

                break;
        }
    }
}

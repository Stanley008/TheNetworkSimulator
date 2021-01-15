package cz.praguecollege;

import java.util.LinkedList;
import java.util.Queue;

public class NetLayer extends Layer implements EventReciever{


    private LinkedList<NetInterface> netInterfaces;
    private LinkedList<NetProtocol> netProtocols;

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

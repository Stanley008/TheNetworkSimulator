package cz.praguecollege.channel;

import cz.praguecollege.Connector;
import cz.praguecollege.EventReciever;

import java.util.LinkedList;

public abstract class Channel implements EventReciever {
    LinkedList<Connector> connectors;
    LinkedList<Cable> cables;

    Channel(LinkedList<Cable> cables) {
        this.cables = cables;
    }
}

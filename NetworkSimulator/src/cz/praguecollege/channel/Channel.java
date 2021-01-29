package cz.praguecollege.channel;

import cz.praguecollege.Connector;
import cz.praguecollege.EventReciever;
import cz.praguecollege.channel.cables.CableDecorator;

import java.util.LinkedList;

public abstract class Channel implements EventReciever {
    LinkedList<Connector> connectors;
    LinkedList<CableDecorator> cables;

    Channel(LinkedList<CableDecorator> cables) {
        this.cables = cables;
    }
}

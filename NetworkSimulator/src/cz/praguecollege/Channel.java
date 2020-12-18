package cz.praguecollege;

import java.util.LinkedList;

public abstract class Channel implements EventReciever {

    LinkedList<Connector> connectors;
}

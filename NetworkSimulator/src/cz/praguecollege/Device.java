package cz.praguecollege;

import java.util.LinkedList;

public abstract class Device {

    private PhyLayer phyLayer;
    private LinkLayer linkLayer;
    private NetLayer netLayer;

    private LinkedList<NetAdapter> netAdapters;

    // TODO switch implementation?

}

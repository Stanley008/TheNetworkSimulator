package cz.praguecollege;

public class LinkLayerInterface extends Interface {
    private final int macAddress;

    public LinkLayerInterface(Interface lowerLayerInterface, int macAddress) {
        super(lowerLayerInterface);
        this.macAddress = macAddress;
    }

    public int getAddress(){
        return macAddress;
    }

}

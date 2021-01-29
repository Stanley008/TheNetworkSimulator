package cz.praguecollege;

public class IPv4Protocol implements  NetProtocol {
    @Override
    public int getProtocolID() {
        return 4;
    }
    IPv4Address sourceAddress;
    IPv4Interface ipv4interface = new IPv4Interface(sourceAddress);
    public void setSourceAddress(IPv4Address address) {
        this.sourceAddress = address;
    }
}

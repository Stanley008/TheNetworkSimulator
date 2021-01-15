package cz.praguecollege;

public class IPv4Protocol implements  NetProtocol {
    @Override
    public int getProtocolID() {
        return 4;
    }
    IPv4Address address;
    IPv4Interface ipv4interface = new IPv4Interface(address);
    public void setAddress(IPv4Address address) {
        this.address = address;
    }
}

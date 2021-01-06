package cz.praguecollege;

public class IPv4Interface implements NetInterface {
    public IPv4Address address;
    // sould it hold a message?
    public IPv4Interface(IPv4Address address) {
        this.address = address;
    }
}

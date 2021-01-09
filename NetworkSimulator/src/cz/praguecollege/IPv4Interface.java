package cz.praguecollege;

public class IPv4Interface implements NetInterface {
    public IPv4Address address;
    // TODO should it hold a message?
    // TODO how do network interfaces connect to linked interfaces?
    public IPv4Interface(IPv4Address address) {
        this.address = address;
    }
}

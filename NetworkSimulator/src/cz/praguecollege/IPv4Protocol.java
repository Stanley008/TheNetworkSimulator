package cz.praguecollege;

public class IPv4Protocol implements  NetProtocol {
    @Override
    public int getProtocolID() {
        return 4;
    }
}

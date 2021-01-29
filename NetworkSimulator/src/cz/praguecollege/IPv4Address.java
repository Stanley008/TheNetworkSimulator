package cz.praguecollege;

public class IPv4Address extends IPAddress {
    int protocol = 4;
    public int sliceIP(String ip, int numOctet) {
        String[] addresses = ip.split("\\.");
        return Integer.parseInt(String.valueOf(addresses[numOctet]));
    }

}

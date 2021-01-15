package cz.praguecollege;

public abstract class IPAddress {
    int firstOctet;
    int secondOctet;
    int thirdOctet;
    int forthOctet;

    public int getFirstOctet() {
        return firstOctet;
    }

    public int getForthOctet() {
        return forthOctet;
    }

    public int getThirdOctet() {
        return thirdOctet;
    }

    public int getSecondOctet() {
        return secondOctet;
    }

    protected IPAddress(String ip) {
        this.firstOctet = sliceIP(ip, 0);
        this.secondOctet = sliceIP(ip, 1);
        this.thirdOctet = sliceIP(ip, 2);
        this.forthOctet = sliceIP(ip, 3);
    }

    protected IPAddress() {
    }

    public abstract int sliceIP(String ip, int numOctet);
}

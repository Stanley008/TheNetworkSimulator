package cz.praguecollege;

public class LinkMessage extends Message {

    public LinkMessage(IPAddress sourceIP, IPAddress destinationIP, String rawData) {
        super();
    }

    @Override
    public int getProtocol() {
        return destinationIP.getProtocol();
    }

    @Override
    public String getContent() {
        return rawData;
    }

    @Override
    public void setContent(String content) {
        rawData = content;
    }
}

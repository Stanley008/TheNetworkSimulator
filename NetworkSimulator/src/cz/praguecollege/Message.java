package cz.praguecollege;

public abstract class Message {
    private Message encapsulatedMessage;
    public IPAddress destinationIP;
    public IPAddress sourceIP;
    public String rawData;

    public void encapsulate(Message message){
        encapsulatedMessage = message;
    }

    public Message decapsulate(){
        Message msg = encapsulatedMessage;
        encapsulatedMessage = null;
        return msg;
    }

    public abstract int getProtocol();
    public abstract String getContent();
    public abstract void setContent(String content);
    // TODO what a message is composed of
    // TODO is it the same as packet, frame or ...
}

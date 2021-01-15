package cz.praguecollege;

public abstract class Message {
    private Message encapsulatedMessage;

    public void encapsulate(Message message){
        encapsulatedMessage = message;
    }

    public Message decapsulate(){
        Message msg = encapsulatedMessage;
        encapsulatedMessage = null;
        return msg;
    }

    public abstract int getProtocol();
}

class NetLayerMessage extends Message {



    @Override
    public int getProtocol() {
        return 0;
    }
}
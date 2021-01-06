package cz.praguecollege;

public abstract class Message {

    public abstract int getProtocol();
    public abstract String getContent();
    public abstract void setContent(String content);
}

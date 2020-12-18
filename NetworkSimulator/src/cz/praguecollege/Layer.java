package cz.praguecollege;

public interface Layer {
    void insertFromUpperLayer(Message msg);
    void insertFromLowerLayer(Message msg);
}

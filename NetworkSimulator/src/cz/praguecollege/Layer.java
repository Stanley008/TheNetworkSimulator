package cz.praguecollege;

import java.util.LinkedList;
import java.util.Queue;

public abstract class Layer implements EventReciever {
    private Queue<Message> upperQueue = new LinkedList<>();
    private Queue<Message> lowerQueue = new LinkedList<>();
    private Layer upperLayer;
    private Layer lowerLayer;

    void setUpperLayer(Layer upperLayer){
        this.upperLayer = upperLayer;
    }

    void setLowerLayer(Layer lowerLayer){
        this.lowerLayer = lowerLayer;
    }

    void insertFromUpperLayer(Message msg){
        upperQueue.add(msg);
    };

    void insertFromLowerLayer(Message msg){
        lowerQueue.add(msg);
    };

    void sentToUpperLayer(Message message){
        upperLayer.insertFromLowerLayer(message);

    }

    void sentToLowerLayer(Message message){
        lowerLayer.insertFromUpperLayer(message);

    }

    Message getNextFromUpperLayer(){
        return upperQueue.remove();
    }

    Message getNextFromLowerLayer(){
        return lowerQueue.remove();
    }
}

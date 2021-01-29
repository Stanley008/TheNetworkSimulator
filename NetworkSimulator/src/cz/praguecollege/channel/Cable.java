package cz.praguecollege.channel;

import cz.praguecollege.Message;

public class Cable {
    protected float delay;

    public float GetDelay() {
        return delay;
    }

    public Message ProcessMsg(Message msg) {
        return msg;
    }

}

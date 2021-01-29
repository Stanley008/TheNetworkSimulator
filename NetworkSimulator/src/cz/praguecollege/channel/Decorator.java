package cz.praguecollege.channel;

import cz.praguecollege.Message;

import java.util.Random;

public class Decorator extends Cable{
    protected Cable cable;
    protected float delay;
    protected int corruptionChance;

    Decorator (Cable cable, float delay, int corruptionChance) {
        this.cable = cable;
        this.delay = delay;
        this.corruptionChance = corruptionChance;
    }

    public float GetDelay() {
        return cable.GetDelay() + delay;
    }

    public Message ProcessMsg(Message msg) {
        Random random = new Random();

        if (random.nextInt(10) >= corruptionChance) {
            return cable.ProcessMsg(msg);
        } else {
            return cable.ProcessMsg(CorruptMsg(msg));
        }
    }

    protected Message CorruptMsg(Message msg) {
        return msg;
    }
}

package cz.praguecollege.channel.conductor;

public abstract class CableConductor {
    protected String type;
    protected float speed;
    protected float delay;
    protected float reliability;
    protected float maxEfficientLength;

    public String getType() {
        return type;
    }

    public float getSpeed() {
        return speed;
    }

    public float getDelay() {
        return delay;
    }

    public float getReliability() {
        return reliability;
    }

    public float maxEfficientLength() {
        return maxEfficientLength;
    }
}

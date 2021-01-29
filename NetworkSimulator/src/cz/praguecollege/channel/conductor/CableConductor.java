package cz.praguecollege.channel.conductor;

public abstract class CableConductor {
    protected float delay;
    protected int corruptionChance;

    public float getDelay() {
        return delay;
    }

    public int getCorruptionChance() {
        return corruptionChance;
    }
}

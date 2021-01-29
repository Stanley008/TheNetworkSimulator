package cz.praguecollege.channel.insulation;

public abstract class CableInsulation {
    protected float delay;
    protected int corruptionChance;

    public float getDelay() {
        return delay;
    }

    public int getCorruptionChance() {
        return corruptionChance;
    }
}

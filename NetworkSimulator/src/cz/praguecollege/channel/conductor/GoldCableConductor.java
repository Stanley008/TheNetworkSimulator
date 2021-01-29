package cz.praguecollege.channel.conductor;

public class GoldCableConductor extends CableConductor{
    public GoldCableConductor() {
        this.type = "gold";
        this.speed = 120f;
        this.delay = 0.2f;
        this.reliability = 0.3f;
        this.maxEfficientLength = 110f;
    }
}

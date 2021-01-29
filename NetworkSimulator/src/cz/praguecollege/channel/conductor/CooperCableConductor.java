package cz.praguecollege.channel.conductor;

public class CooperCableConductor extends CableConductor{
    public CooperCableConductor() {
        this.type = "cooper";
        this.speed = 100f;
        this.delay = 0.4f;
        this.reliability = 0.6f;
        this.maxEfficientLength = 100f;
    }
}

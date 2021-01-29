package cz.praguecollege.channel.conductor;

public class SteelCableConductor extends CableConductor{
    public SteelCableConductor() {
        this.type = "steel";
        this.speed = 60f;
        this.delay = 0.8f;
        this.reliability = 1.2f;
        this.maxEfficientLength = 90f;
    }
}

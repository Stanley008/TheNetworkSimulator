package cz.praguecollege.channel.jacket;

public class PEJacket extends CableJacket {
    public PEJacket() {
        this.type = "PE";
        this.minTemperatureRange = -55f;
        this.maxTemperatureRange = 600f;
        this.thickness = 45f;
    }
}

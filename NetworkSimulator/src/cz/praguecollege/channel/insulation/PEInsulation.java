package cz.praguecollege.channel.insulation;

public class PEInsulation extends CableInsulation{
    public PEInsulation() {
        this.type = "PE";
        this.minTemperatureRange = -55f;
        this.maxTemperatureRange = 600f;
        this.thickness = 45f;
    }
}

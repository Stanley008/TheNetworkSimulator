package cz.praguecollege.channel.insulation;

public class PVCInsulation extends CableInsulation{
    public PVCInsulation() {
        this.type = "PVC";
        this.minTemperatureRange = -10f;
        this.maxTemperatureRange = 60f;
        this.thickness = 60f;
    }
}

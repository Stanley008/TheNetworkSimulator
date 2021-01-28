package cz.praguecollege.channel.jacket;

public class PVCJacket extends CableJacket {
    public PVCJacket() {
        this.type = "PVC";
        this.minTemperatureRange = -10f;
        this.maxTemperatureRange = 60f;
        this.thickness = 60f;
    }
}

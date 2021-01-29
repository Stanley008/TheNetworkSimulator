package cz.praguecollege.channel.jacket;

public abstract class CableJacket {
    protected String type;
    protected float minTemperatureRange;
    protected float maxTemperatureRange;
    protected float thickness;

    public String getType() {
        return type;
    }

    public float getMinTemperatureRange() {
        return minTemperatureRange;
    }

    public float getMaxTemperatureRange() {
        return maxTemperatureRange;
    }

    public float getThickness() {
        return thickness;
    }
}
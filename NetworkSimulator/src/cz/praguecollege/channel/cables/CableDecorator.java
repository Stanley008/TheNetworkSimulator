package cz.praguecollege.channel.cables;

import cz.praguecollege.channel.conductor.CableConductor;
import cz.praguecollege.channel.insulation.CableInsulation;
import cz.praguecollege.channel.jacket.CableJacket;

public abstract class CableDecorator {
    protected CableConductor conductor;
    protected CableInsulation insulation;
    protected CableJacket jacket;

    public CableConductor getConductor() {
        return conductor;
    }

    public CableInsulation getInsulation() {
        return insulation;
    }

    public CableJacket getJacket() {
        return jacket;
    }
}

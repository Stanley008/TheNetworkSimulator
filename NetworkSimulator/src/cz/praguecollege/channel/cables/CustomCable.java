package cz.praguecollege.channel.cables;

import cz.praguecollege.channel.conductor.CableConductor;
import cz.praguecollege.channel.insulation.CableInsulation;
import cz.praguecollege.channel.jacket.CableJacket;

public class CustomCable extends CableDecorator {
    public CustomCable(CableConductor conductor, CableInsulation insulation, CableJacket jacket) {
        this.conductor = conductor;
        this.insulation = insulation;
        this.jacket = jacket;
    }
}

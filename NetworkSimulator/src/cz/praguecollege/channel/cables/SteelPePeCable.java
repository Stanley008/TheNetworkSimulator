package cz.praguecollege.channel.cables;

import cz.praguecollege.channel.conductor.SteelCableConductor;
import cz.praguecollege.channel.insulation.PEInsulation;
import cz.praguecollege.channel.jacket.PEJacket;

public class SteelPePeCable extends CableDecorator{
    SteelPePeCable() {
        this.conductor = new SteelCableConductor();
        this.insulation = new PEInsulation();
        this.jacket = new PEJacket();
    }
}

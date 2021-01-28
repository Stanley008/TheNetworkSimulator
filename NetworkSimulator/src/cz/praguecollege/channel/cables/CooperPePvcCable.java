package cz.praguecollege.channel.cables;

import cz.praguecollege.channel.conductor.CooperCableConductor;
import cz.praguecollege.channel.insulation.PEInsulation;
import cz.praguecollege.channel.jacket.PVCJacket;

public class CooperPePvcCable extends CableDecorator{
    CooperPePvcCable() {
        this.conductor = new CooperCableConductor();
        this.insulation = new PEInsulation();
        this.jacket = new PVCJacket();
    }
}

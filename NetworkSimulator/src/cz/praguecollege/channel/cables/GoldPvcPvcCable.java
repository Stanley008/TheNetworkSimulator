package cz.praguecollege.channel.cables;

import cz.praguecollege.channel.conductor.GoldCableConductor;
import cz.praguecollege.channel.insulation.PVCInsulation;
import cz.praguecollege.channel.jacket.PVCJacket;

public class GoldPvcPvcCable extends CableDecorator{
    GoldPvcPvcCable() {
        this.conductor = new GoldCableConductor();
        this.insulation = new PVCInsulation();
        this.jacket = new PVCJacket();
    }
}

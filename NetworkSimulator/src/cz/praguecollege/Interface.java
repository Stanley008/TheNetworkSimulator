package cz.praguecollege;

public abstract class Interface {

    private Interface lowerLayerInterface;

    public Interface(Interface lowerLayerInterface){
        this.lowerLayerInterface = lowerLayerInterface;
    }

    public Interface getLowerLayerInterface(){
        return lowerLayerInterface;
    }
}

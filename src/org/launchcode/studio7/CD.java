package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    private static int spinSpeedMin = 200;
    private static int spinSpeedMax = 500;

    public CD(int totalStorageSpace, String name){
        super(totalStorageSpace, name);
    }

    @Override
    public void spinDisc(){
        System.out.println("A CD spins at a rate of " + spinSpeedMin + " - " + spinSpeedMax + " rpm.");
    }

    @Override
    public void writeToDisc(){

    }

    @Override
    public void readData(){

    }
}

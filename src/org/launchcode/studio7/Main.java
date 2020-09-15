package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

        CD myCD = new CD(734003200, "Will's Mix Tape");
        DVD myDVD = new DVD(1460000000, "Star Wars");

        myCD.spinDisc();
        myDVD.spinDisc();

        System.out.println("This CD can store " + myCD.getTotalStorageSpace() + " bytes of data");
        System.out.println("This DVD can store " + myDVD.getTotalStorageSpace() + " bytes of data");

    }
}

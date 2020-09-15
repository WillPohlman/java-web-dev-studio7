package org.launchcode.studio7;

public abstract class BaseDisc
{
    private int totalStorageSpace;
    private int currentStorageSpace;
    private String name;

    public BaseDisc(int totalStorageSpace, String name){
        this.totalStorageSpace = totalStorageSpace;
        this.currentStorageSpace = totalStorageSpace;
        this.name = name;
    }


    public int getTotalStorageSpace()
    {
        return totalStorageSpace;
    }

    public int getCurrentStorageSpace()
    {
        return currentStorageSpace;
    }

    public void setCurrentStorageSpace(int currentStorageSpace)
    {
        this.currentStorageSpace = currentStorageSpace;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}

package com.careerdevs.animalfactory;

public class Animal {
    // Fields: species (String), legs (short), isTerrestrial (boolean)
    public String species;
    public short legs;
    public boolean isTerrestrial;

    public Animal (String species, short legs, boolean isTerrestrial) {
        this.species = species;
        this.legs = legs;
        this.isTerrestrial = isTerrestrial;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species: '" + species + '\'' +
                ", legs: " + legs +
                ", isTerrestrial: " + isTerrestrial +
                '}';
    }
}

package com.careerdevs.animalfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // creating Scanner Variable
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to: Create an Animal");
        // asking questions
        System.out.print("Enter A Species\nInput: ");
        String speciesInput = scanner.nextLine();

        System.out.print("Enter The # of Legs\nInput: ");
        short legsInput = scanner.nextShort();

        System.out.print("Does the animal live on land?\n(true/false): ");
        boolean isTerrestrialInput = scanner.nextBoolean();


        // creating instance
        Animal userGeneratedAnimal = new Animal(speciesInput, legsInput, isTerrestrialInput);

        // output field values
        System.out.println(userGeneratedAnimal);


    }
}

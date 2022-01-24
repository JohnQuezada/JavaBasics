package com.careerdevs.fruitfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to: Create a Fruit");

        System.out.print("Enter A Name\nInput: ");
        String nameInput = scanner.nextLine();

        System.out.print("Enter The Color\nInput: ");
        String colorInput = scanner.nextLine();

        System.out.print("Does the fruit have seeds?\n(true/false): ");
        boolean hasSeedsInput = scanner.nextBoolean();

        Fruit userGeneratedFruit = new Fruit(nameInput, colorInput, hasSeedsInput);

        System.out.println(userGeneratedFruit);
    }
}

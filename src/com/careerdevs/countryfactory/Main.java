package com.careerdevs.countryfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to: Create a Country");

        System.out.print("Enter A Name\nInput: ");
        String nameInput = scanner.nextLine();

        System.out.print("Enter The Population\nInput: ");
        long populationInput = scanner.nextLong();

        System.out.println("Enter the Capital\nInput: ");
        String capitalInput = scanner.nextLine();

        Country userGeneratedCountry = new Country(nameInput, populationInput, capitalInput);

        System.out.println(userGeneratedCountry);
    }
}

package com.careerdevs.moviefactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to: Create a Movie");

        System.out.print("Enter A Title\nInput: ");
        String titleInput = scanner.nextLine();

        System.out.print("Enter The Director\nInput: ");
        String directorInput = scanner.nextLine();

        System.out.println("Enter the Runtime in Minutes\nInput: ");
        float runtimeInMinInput = scanner.nextFloat();

        System.out.print("Has the movie been released?\n(true/false): ");
        boolean hasBeenReleasedInput = scanner.nextBoolean();

        Movie userGeneratedMovie = new Movie(titleInput, directorInput, runtimeInMinInput, hasBeenReleasedInput);

        System.out.println(userGeneratedMovie);
    }
}

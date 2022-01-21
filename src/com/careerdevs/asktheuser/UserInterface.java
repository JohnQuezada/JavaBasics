package com.careerdevs.asktheuser;


import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userInput1 = scanner.nextLine();
        System.out.println("Hello " + userInput1);

        System.out.println("What is your age?");
        byte userInput2 = scanner.nextByte();
        System.out.println("Wow " + userInput2 + " is pretty old!");

        System.out.println("What is your favorite number?");
        short userInput3 = scanner.nextShort();
        System.out.println(userInput3 + "? That is a cool number!");

        System.out.println("How many days a week do you code?");
        int userInput4 = scanner.nextInt();
        System.out.println(userInput4 + "? Woah you're a computer genius!");

        System.out.println("What is your favorite decimal number?");
        float userInput5 = scanner.nextFloat();
        System.out.println(userInput5 + "? That's like the best one!");

        System.out.println("How many lines of code have you written?");
        long userInput6 = scanner.nextLong();
        System.out.println(userInput6 + "? You're like Neo from The Matrix!");

        System.out.println("How much money do you make as a developer?");
        double userInput7 = scanner.nextDouble();
        System.out.println("Woah, I also make " + userInput7);

        System.out.println("This program is pretty cool right?");
        Boolean userInput8 = scanner.nextBoolean();
        System.out.println(userInput8 + "? I agree with that!");
    }
}

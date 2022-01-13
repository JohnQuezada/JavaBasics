package com.careerdevs.sayhello;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    whatIsYourName();
    whatIsYourFullName();

    }

    public static void whatIsYourName() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name\nName:");
        String name = scanner.next();

        System.out.println("Hello, nice to meet you" + " " + name);
    }

    public static void whatIsYourFullName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your first name\nFirst Name:");
        String firstName = scanner.next();

        System.out.println("What is your last name\nLast Name:");
        String lastName = scanner.next();

        System.out.println("It is so nice to formally meet you " + firstName + " " + lastName);
    }
}

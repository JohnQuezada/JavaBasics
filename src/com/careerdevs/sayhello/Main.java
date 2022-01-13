package com.careerdevs.sayhello;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name\nName:");
        String name = scanner.next();

        System.out.println("Hello, nice to meet you" + " " + name);
    }
}

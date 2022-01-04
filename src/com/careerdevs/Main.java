package com.careerdevs;

public class Main {

    public static void main(String[] args) {
	String firstName = "John";
    String lastName = "Quezada";
    String fullName = firstName + ' ' + lastName;
        System.out.println(fullName);
    }

    public static String createFullName(String a, String b) {
        return a + " " + b;

    }
}

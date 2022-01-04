package com.careerdevs;

public class Main {

    public static void main(String[] args) {
//	String firstName = "John";
//    String lastName = "Quezada";
//    String fullName = firstName + ' ' + lastName;
//        System.out.println(fullName);

        Car carOne = new Car("Camaro 2SS", "Chevy", 10000, 0.10f);
        Car carTwo = new Car("Mustang GT", "Ford", 30000, 0.50f);
        Car carThree = new Car("Hellcat", "Dodge", 100, 0.90f);

        System.out.println(carOne.make + " " + carOne.model);
        System.out.println(carTwo.make + " " + carTwo.model);
        System.out.println(carThree.make + " " + carThree.model);


    }

//    public static String createFullName(String a, String b) {
//        return a + " " + b;
//
//    }
}

package com.careerdevs.introtorecursion;


// recursion: is when a method calls itself

public class Main {
    public static void main(String[] args) {
        //System.out.println(sum(2));
        System.out.println(countDown(5));
    }

    // edabit challenge
    public static int sum(int n) {
        if (n >= 1) {
            return sum(n - 1) + n;
        }
        return n;
    }

    public static int countDown(int n) {
        for (int i = n; i >= 1 ; i--) {
            System.out.println(i);
        } return n;
    }
}

package com.careerdevs.introtorecursion;

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(2));
    }

    // edabit challenge
    public static int sum(int n) {
        if (n >= 1) {
            return sum(n - 1) + n;
        }
        return n;
    }
}

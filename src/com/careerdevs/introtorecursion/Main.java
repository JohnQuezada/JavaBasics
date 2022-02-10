package com.careerdevs.introtorecursion;


// recursion: is when a method calls itself

public class Main {
    public static void main(String[] args) {
        //System.out.println(sum(2));
        countDown(5);
    }

    // edabit challenge
    public static int sum(int n) {
        if (n >= 1) {
            return sum(n - 1) + n;
        }
        return n;
    }

    // iterative solution
//    public static void countDown(int count) {
//        for (int i = count; i >= 0 ; i--) {
//            System.out.println(i);
//        }
//    }

    // recursive solution
    private static void countDown(int count) {
        System.out.println(count);
        if (count > 0) {
            countDown(--count);
        }
    }
}

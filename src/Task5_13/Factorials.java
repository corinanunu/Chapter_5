package Task5_13;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        long factorial = 1;
        System.out.println("******************************");
        System.out.printf("|%3s  |%20s  |\n", "N", "N!");
        System.out.println("------------------------------");
        for(int i = 1; i <= 20; i++) {
            factorial *= i;
            System.out.printf("|%3d  |%20d  |", i, factorial);
            System.out.println();
            System.out.println("------------------------------");
        }
    }
}
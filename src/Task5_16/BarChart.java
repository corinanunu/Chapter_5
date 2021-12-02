package Task5_16;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number between 1 and 30 --> ");
        number1 = input.nextInt();
        System.out.print("Enter second number between 1 and 30 --> ");
        number2 = input.nextInt();
        System.out.print("Enter third number between 1 and 30 --> ");
        number3 = input.nextInt();
        System.out.print("Enter fourth number between 1 and 30 --> ");
        number4 = input.nextInt();
        System.out.print("Enter fifth number between 1 and 30 --> ");
        number5 = input.nextInt();

        System.out.println();
        System.out.println("-----------------------------------");
        System.out.printf("|%4d|", number1);
        for(int i = 0; i < number1; i++){
            System.out.printf("*");
        }
        System.out.println();

        System.out.printf("|%4d|", number2);
        for(int i = 0; i < number2; i++){
            System.out.printf("*");
        }
        System.out.println();

        System.out.printf("|%4d|", number3);
        for(int i = 0; i < number3; i++){
            System.out.printf("*");
        }
        System.out.println();

        System.out.printf("|%4d|", number4);
        for(int i = 0; i < number4; i++){
            System.out.printf("*");
        }
        System.out.println();

        System.out.printf("|%4d|", number5);
        for(int i = 0; i < number5; i++){
            System.out.printf("*");
        }
        System.out.println();
        System.out.println("-----------------------------------");

    }
}
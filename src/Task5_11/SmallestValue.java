package Task5_11;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        int number;
        int nr;
        int smallest = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of numbers --> ");
        nr = input.nextInt();

        for(int i = 0; i < nr; i++){
            System.out.printf("Numeber %d : ", i+1);
            number = input.nextInt();

            if(i == 1){
                smallest = number;
            }else if (number < smallest){
                smallest = number;
            }
        }

        System.out.printf("The smallest number is --> %d", smallest);

    }

}
package Task5_12;

public class ProductOfOddIntegers {
    public static void main(String[] args) {
        int product = 1;

        for(int i = 1; i <= 15; i+=2){
            System.out.printf("%d ", i);
            product *= i;
        }

        System.out.println();
        System.out.printf("Produc of Odd Integers is --> %d", product);
    }
}
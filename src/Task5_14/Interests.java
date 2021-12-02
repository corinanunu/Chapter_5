package Task5_14;

public class Interests {
    public static void main(String[] args) {
        double amount1;
        double amount2;
        double amount3;
        double amount4;
        double amount5;
        double amount6;
        double principal = 1000.0;
        double rate1 = 0.05;
        double rate2 = 0.06;
        double rate3 = 0.07;
        double rate4 = 0.08;
        double rate5 = 0.09;
        double rate6 = 0.1;

        System.out.println("***** Amount on deposit *****");
        System.out.printf("%s %15s %15s %15s %15s %15s %15s %n", "Year", "Rate = 5%", "Rate = 6%", "Rate = 7%",
                "Rate = 8%","Rate = 9%", "Rate = 10%");

        for(int year = 1; year <= 10; year++){
            amount1 = principal * Math.pow(1.0 + rate1, year);
            amount2 = principal * Math.pow(1.0 + rate2, year);
            amount3 = principal * Math.pow(1.0 + rate3, year);
            amount4 = principal * Math.pow(1.0 + rate4, year);
            amount5 = principal * Math.pow(1.0 + rate5, year);
            amount6 = principal * Math.pow(1.0 + rate6, year);

            System.out.printf("%3d %,15.2f %,15.2f  %,15.2f  %,15.2f  %,15.2f  %,15.2f %n", year, amount1, amount2,
                    amount3, amount4, amount5, amount6);
        }
    }

}
package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter yor income in UAH:");
        Scanner scanner = new Scanner(System.in);

        int income = scanner.nextInt();
        double persent = 0.025;
        if (income > 0 && income <= 10000) {
            persent = 0.025;
        }
        else if (income > 0 && income <= 25000)
        {
            persent = 0.043;
        }
        else //(income > 25000)
        {
            persent = 0.067;
        }

        System.out.printf("Tax amount is: %.2f UAH\n", income*persent);

    }
}
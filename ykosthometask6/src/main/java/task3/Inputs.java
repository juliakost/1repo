package task3;

import java.util.Scanner;

public class Inputs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Type 1st number:");
        double a = sc.nextDouble();

        System.out.println("Type operation in the form of +, -, /, * :");
        String operation = sc.next();

        char c = operation.charAt(0);

        System.out.println("Type 2nd number:");
        double b = sc.nextDouble();

        sc.close();

        SimpleCalculator test = new SimpleCalculator();

        if (c == '+') {
            System.out.println("The sum is:" + test.add(a, b));

        } else if (c == '-') {
            System.out.println("The substract is: " + test.subtract(a, b));

        } else if (c == '*') {
            System.out.println("The multiplication is: " + test.multiplication(a, b));

        } else if (c == '/') {
        System.out.println("The division is: " + test.divide(a, b));
    } else{
            System.out.println("Entered operation is not supported");
        }

    }
}

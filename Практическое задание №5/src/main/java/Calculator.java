import Chisla.OneChislo;
import Chisla.TwoChislo;
import Operations.Division;
import Operations.Minus;
import Operations.Multiply;
import Operations.Plus;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        OneChislo one = new OneChislo(scanner.nextDouble());
        System.out.println("Enter the second number:");
        TwoChislo two = new TwoChislo(scanner.nextDouble());
        System.out.println("Enter operation:");
        String operation = scanner.next();
        double result;

        if (operation.equals("+")) {
            Plus plus = new Plus();
            result = plus.operation(one, two);
            System.out.printf("%.3f", result);
        } else if (operation.equals("-")) {
            Minus minus = new Minus();
            result = minus.operation(one, two);
            System.out.printf("%.3f", result);
        } else if (operation.equals("*")) {
            Multiply multiply = new Multiply();
            result = multiply.operation(one, two);
            System.out.printf("%.3f", result);
        } else if (operation.equals("/")) {
            if (two.getChislo() == 0) {
                System.out.println("Error, you can not divided by zero");
            } else {
                Division division = new Division();
                result = division.operation(one, two);
                System.out.printf("%.3f", result);
            }
        } else {
            System.out.println("Error operation");
        }
        scanner.close();
    }
}

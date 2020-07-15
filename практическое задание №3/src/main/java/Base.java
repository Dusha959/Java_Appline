/**
 * This program include two methods.
 * In main user choose one of them.
 * @see #calculator()
 * @see #maxElementOfArray()
 * @author Andrew Tretyakov
 */


import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of task: (1 - calculator, 2 - string array)");
        int i = scanner.nextInt();
        if (i == 1) {
            calculator();
        } else if (i == 2) {
            maxElementOfArray();
        } else {
            System.out.println("Error number");
        }
        scanner.close();
    }
//ordinary calculator with following operation: +, -, *, /.
    public static void calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double secondNumber = scanner.nextDouble();
        System.out.println("Enter operation:");
        String operation = scanner.next();
        double result;

        if (operation.equals("+")) {
            result = firstNumber + secondNumber;
            System.out.printf("%.3f", result);
        } else if (operation.equals("-")) {
            result = firstNumber - secondNumber;
            System.out.printf("%.3f", result);
        } else if (operation.equals("*")) {
            result = firstNumber * secondNumber;
            System.out.printf("%.3f", result);
        } else if (operation.equals("/")) {
            if (secondNumber == 0) {
                System.out.println("Error, you can not divided by zero");
            } else {
                result = firstNumber / secondNumber;
                System.out.printf("%.3f", result);
            }
        } else {
            System.out.println("Error operation");
        }
        scanner.close();
    }
//searches for a word of maximum length in an array specified by the user
    public static void maxElementOfArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements of array:");
        int length = scanner.nextInt();
        if (length <= 0) {
            System.out.println("Wrong number"); 
        }
        String[] words = new String[length];
        int maxLength = -1;
        String maxWord = null;
        for (int i = 0; i < length; i++) {
            System.out.println("Enter word:");
            words[i] = scanner.next();
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
                maxWord = words[i];
            }
        }
        System.out.println("Word with maximum length is: " + maxWord);
    }
}

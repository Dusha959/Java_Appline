import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        String firstNumber = Double.toString(scanner.nextDouble());
        System.out.print("Введите второе число: ");
        int secondNumber = (int) scanner.nextDouble();
        if ((int) Double.parseDouble(firstNumber) > secondNumber){
            System.out.println(firstNumber);
            System.out.println((double) secondNumber);
        } else if ((int) Double.parseDouble(firstNumber) < secondNumber){
            System.out.println(secondNumber);
            System.out.println(Double.parseDouble(firstNumber));
        }
    }
}

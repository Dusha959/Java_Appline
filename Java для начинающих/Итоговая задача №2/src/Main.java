import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввод: ");
        String input = scanner.nextLine();
        if (input.charAt(4) == 'x'){
            char firstNumber = input.charAt(0);
            char secondNumber = input.charAt(2);
            if (input.charAt(1) == '+'){
                System.out.print("Вывод: " + (Character.digit(firstNumber, 10)
                        + Character.digit(secondNumber, 10)));
            } else {
                System.out.print("Вывод: " + (Character.digit(firstNumber, 10)
                        - Character.digit(secondNumber, 10)));
            }
        } else if (input.charAt(1) == '+'){
            char secondNumber = input.charAt(4);
            char firstNumber;
            if (input.charAt(0) == 'x'){
                firstNumber = input.charAt(2);
            } else {
                firstNumber = input.charAt(0);
            }
            System.out.print("Вывод: " + (Character.digit(secondNumber, 10)
                    - Character.digit(firstNumber, 10)));
        } else {
            char secondNumber = input.charAt(4);
            if (input.charAt(0) == 'x'){
                char firstNumber = input.charAt(2);
                System.out.print("Вывод: " + (Character.digit(secondNumber, 10)
                        + Character.digit(firstNumber, 10)));
            } else {
                char firstNumber = input.charAt(0);
                System.out.print("Вывод: " + (Character.digit(firstNumber, 10)
                        - Character.digit(secondNumber, 10)));
            }
        }
    }
}

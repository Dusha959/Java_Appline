import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double one = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double two = scanner.nextDouble();
        System.out.print("Введите операцию: ");
        String operation = scanner.next();
        switch (operation){
            case "+":
                System.out.println("Результат: " + (one + two));
                break;
            case "-":
                System.out.println("Результат: " + (one - two));
                break;
            case "*":
                System.out.println("Результат: " + (one * two));
                break;
            case "/":
                if (two == 0) {
                    System.out.println("На 0 делить нельзя!");
                    break;
                }
                System.out.println("Результат: " + (one / two));
                break;
        }
    }
}

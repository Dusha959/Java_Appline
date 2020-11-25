import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число x: ");
        double x = scanner.nextDouble();
        System.out.print("Введите число y: ");
        double y = scanner.nextDouble();
        System.out.print("Введите число z: ");
        double z = scanner.nextDouble();
        double medium = (x + y + z) / 3;
        System.out.println("Cреднее арифметическое равно: " + medium);
        medium /= 2;
        if (medium > 3){
            System.out.println("Программа выполнена корректно");
        }

    }
}

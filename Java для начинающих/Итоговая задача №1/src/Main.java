import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Курс доллара: ");
        double rate = scanner.nextDouble();
        System.out.print("Колличество рублей: ");
        double rub = scanner.nextDouble();
        System.out.printf("Итого: %.2f долларов", rate * rub);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++){
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Сумма нечетных чисел до " + n + " равна " + sum);
    }
}

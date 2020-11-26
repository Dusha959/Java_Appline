import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int i = scanner.nextInt();
        double[] array = new double[i];
        int k = 0;
        double sum = 0;
        while(k < i){
            System.out.println("Задайте " + (k + 1) + " член массива:");
            array[k] = scanner.nextDouble();
            sum += array[k];
            k++;
        }
        sum /= i;
        for (double j : array) {
            System.out.println(j * sum);
        }
    }
}

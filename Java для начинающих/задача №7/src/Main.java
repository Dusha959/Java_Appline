import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = 5.6;
        double y = 7.3;
        double z = -2.3;
        System.out.print("задайте размер массива: ");
        int i = scanner.nextInt();
        double[] array = new double[i];
        int k = 0;
        while (k < i){
            System.out.println("Задайте " + (k + 1) + " член массива:");
            array[k] = scanner.nextDouble();
            k++;
        }
        for (double j: array) {
            if (j == x || j ==y || j ==z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}

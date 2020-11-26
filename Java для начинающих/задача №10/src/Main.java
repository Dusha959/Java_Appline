import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите колличество строк матрицы: ");
        int i = scanner.nextInt();
        System.out.print("Введите колличество столбцов матрицы: ");
        int j = scanner.nextInt();
        double array[][] = new double[i][j];
        int k = 0;
        while (k < i){
            int e = 0;
            while (e < j){
                System.out.println("Введите [" + k +", " + e + "] элемент матрицы");
                array[k][e] = scanner.nextDouble();
                e++;
            }
            k++;
        }
        for (k = 0; k < j; k++){
            System.out.println(array[0][k] * 3);
        }
    }
}

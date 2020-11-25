import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mily = 0.0006;
        double yard = 1.094;
        double fut = 3.281;
        double kilo = 0.001;
        double karat = 5;
        double unc = 0.035274;
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int choose = scanner.nextInt();
        if (choose == 1){
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - карат, 4 - унция");
            int ed = scanner.nextInt();
            System.out.println("Введите число");
            double number = scanner.nextDouble();
            if (ed == 1){
                System.out.println("Результат:\nГрамм: " + number + "\nКилограмм: " + (number * kilo) + "\nКарат: " +
                        (number * karat) + "\nУнций: " + (number * unc));
            } else if (ed == 2){
                System.out.println("Результат:\nГрамм: " + (number / kilo) + "\nКилограмм: " + number + "\nКарат: " +
                        (number / kilo * karat) + "\nУнций: " + (number / kilo * unc));
            } else if (ed == 3){
                System.out.println("Результат:\nГрамм: " + (number / karat) + "\nКилограмм: " + (number / karat * kilo)
                        + "\nКарат: " + number + "\nУнций: " + (number / karat * unc));
            } else if (ed == 4){
                System.out.println("Результат:\nГрамм: " + (number / unc) + "\nКилограмм: " + (number / unc * kilo)
                        + "\nКарат: " + (number / unc * karat) + "\nУнций: " + number);
            } else {
                System.out.println("Нужно ввести либо 1, либо 2, либо 3, либо 4");
            }
        } else if (choose == 2){
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int ed = scanner.nextInt();
            System.out.println("Введите число");
            double number = scanner.nextDouble();
            if (ed == 1){
                System.out.println("Результат:\nМетры: " + number + "\nМили: " + (number * mily) + "\nЯрды: " +
                        (number * yard) + "\nФуты: " + (number * fut));
            } else if (ed == 2){
                System.out.println("Результат:\nМетры: " + (number / mily) + "\nМили: " + number + "\nЯрды: " +
                        (number / mily * yard) + "\nФуты: " + (number / mily * fut));
            } else if (ed == 3){
                System.out.println("Результат:\nМетры: " + (number / yard) + "\nМили: "
                        + (number / yard * mily) + "\nЯрды: " + number + "\nФуты: " + (number / yard * fut));
            } else if (ed == 4){
                System.out.println("Результат:\nМетры: " + (number / fut) + "\nМили: "
                        + (number / fut * mily) + "\nЯрды: " + (number / fut * yard) + "\nФуты: " + number);
            } else {
                System.out.println("Нужно ввести либо 1, либо 2, либо 3, либо 4");
            }
        } else {
            System.out.println("Нужно ввести либо 1, либо 2");
        }
    }
}

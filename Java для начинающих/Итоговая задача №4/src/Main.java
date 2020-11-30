import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Загадка: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("У тебя есть 3 попытки. На первой попытке можешь взять подсказку. " +
                "Для этого нужно ввести слово \"подсказка\"");
        int i = 1;
        boolean flagAnswer = true;
        boolean flag = false;
        while (i <= 3){
            System.out.print("Твой ответ: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Заархивированный вирус")){
                System.out.println("Правильно!");
                flagAnswer = false;
                break;
            } else if (input.equalsIgnoreCase("подсказка")){
                if (i == 1) {
                    flag = true;
                    System.out.println("Думай как тестировщик");
                } else {
                    System.out.println("Подсказка уже не доступна");
                    continue;
                }
            } else {
                if (i == 2 && flag) {
                    break;
                } else if (i == 1 || i == 2) {
                    System.out.println("Подумай еще!");
                }
            }
            i++;
        }
        if (flagAnswer){
            System.out.println("Обидно, приходи в другой раз");
        }
    }
}

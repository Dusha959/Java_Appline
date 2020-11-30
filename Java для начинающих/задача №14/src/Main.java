import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        int i = 0;
        int min = 21;
        int max = -21;
        while (i < array.length){
            array[i] = -20 + random.nextInt(40);
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
            System.out.println(array[i]);
            i++;
        }
        if (Math.abs(min) > Math.abs(max)){
            System.out.println("Минимальный элемент " + min + " по модулю больше максимального");
        } else if (Math.abs(max) > Math.abs(min)){
            System.out.println("Максимальный элемент " + max + " по модулю больше минимального");
        } else {
            System.out.println("Максимальный и минимальный элементы по модулю равны");
        }
    }
}

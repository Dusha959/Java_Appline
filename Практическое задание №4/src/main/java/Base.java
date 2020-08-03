import sweets.Candy;
import sweets.ChocolateBar;
import sweets.Cookie;
import sweets.Sweets;


public class Base {
    public static void main(String[] args) {
        minMaxArray();
        ChocolateBar chocolateBar1 = new ChocolateBar("milka", 50.6, 120.3, 20.4);
        ChocolateBar chocolateBar2 = new ChocolateBar("alpen gold", 30.9, 110.36, 20.0);
        Cookie cookie = new Cookie("some cookie", 23.45, 300.44, 500.79);
        Candy candy1 = new Candy("alenka", 33.2, 100.0, "chocolate");
        Candy candy2 = new Candy();
        candy2.setName("bob");
        candy2.setPrice(45.78);
        candy2.setWeight(99.3);
        candy2.setFilling("caramel");
        double price = 0;
        double weight = 0;
        Sweets [] gift = {chocolateBar1, chocolateBar2, cookie, candy1, candy2};
        for (Sweets someGift: gift) {
            price = price + someGift.getPrice();
            weight = weight + someGift.getWeight();
        }

        System.out.println("Price of gift = " + price);
        System.out.println("Weight of gift = " + weight);

        for (Sweets someGift: gift) {
            System.out.println(someGift.toString());
        }

    }

    public static void minMaxArray() {
        int[] number = new int[20];
        int max = -11;
        int min = 11;
        int indexMax = 0;
        int indexMin = 0;

        for(int i = 0; i < 20; i++) {
            number[i] = (int) (Math.random() * 21 - 10);
            if (number[i] > max && number[i] < 0) {
                max = number[i];
                indexMax = i;
            } else if (number[i] < min && number[i] > 0) {
                min = number[i];
                indexMin = i;
            }
        }
        number[indexMax] = min;
        number[indexMin] = max;
    }
}

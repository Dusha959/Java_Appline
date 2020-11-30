public class Main {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        if (str.contains("Java") && str.startsWith("I like") && str.endsWith("!!!")){
            System.out.println(str.toUpperCase());
        }
        System.out.println(str.replace('a', 'o').substring(7, 11));
    }
}

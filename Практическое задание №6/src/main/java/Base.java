import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь файла");
        String path = scanner.nextLine();
        Map<String,Integer> keyValue = new TreeMap<String,Integer>(String.CASE_INSENSITIVE_ORDER);
        File file = new File(path);
        try (Scanner scanner1 = new Scanner(file)) {
            while (scanner1.hasNextLine()) {
                String[] array = scanner1.nextLine().split(" ");
                for (int i = 0; i <= array.length - 1; i++) {
                    if (keyValue.containsKey(array[i])) {
                        int counter = keyValue.get(array[i]);
                        keyValue.put(array[i], counter + 1);
                    } else {
                        keyValue.put(array[i], 1);
                    }
                }
            }
            System.out.println(keyValue);
            Integer max = Collections.max(keyValue.values());
            Set<String> keys = new HashSet<>();
            for (Map.Entry<String, Integer> entry : keyValue.entrySet()) {
                if (entry.getValue().equals(max)) {
                    keys.add(entry.getKey());
                }
            }
            System.out.println(keys);
        } catch (FileNotFoundException ex) {
            System.out.println("Exception thrown: " + ex);
        }
    }
}

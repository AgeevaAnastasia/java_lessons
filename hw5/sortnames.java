import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class sortnames {
    /*
     * Написать программу, которая найдет и выведет повторяющиеся имена с
     * количеством повторений.
     * Отсортировать по убыванию популярности.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("names.txt"));
        String line = "";
        String lines = "";
        while ((line = br.readLine()) != null) {
            lines += line;
            lines += " ";
        }
        br.close();

        String[] arr = lines.split(" ");
        Map<String, Integer> nameMap = new HashMap<>();
        for (int i = 0; i < arr.length; i += 2) {
            if (nameMap.containsKey(arr[i])) {
                nameMap.replace(arr[i], nameMap.get(arr[i]) + 1);
            } else {
                nameMap.put(arr[i], 1);
            }
        }
        System.out.println(nameMap);
        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : nameMap.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> x : nameMap.entrySet()) {
                String key = x.getKey();
                if (nameMap.get(key) == i) {
                    sortedNameMap.put(key, nameMap.get(key));
                }
            }
        }
        System.out.println(sortedNameMap);
    }
}
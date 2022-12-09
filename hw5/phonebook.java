import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class phonebook {
    /*
     * Реализуйте структуру телефонной книги с помощью HashMap,
     * учитывая, что 1 человек может иметь несколько телефонов.
     * 
     */

    public static void main(String[] args) {

        // Организовать меню вайл тру с выходом по пустой строке

        Map<Integer, String> db = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.printf(
                    "\nВведите имя и номер телефона через запятую: \nвведите show для просмотра всей телефонной книги\nвведите имя для просмотра телефонных номеров абонента\nнажмите <enter> для выхода из программы\n\nВведите ваш выбор: ");
            String text = sc.nextLine();
            if (text.equals("")) {
                break;
            } else if (text.equals("show")) {
                for (Integer all : db.keySet()) {
                    System.out.printf("%s: %d\n", db.get(all), all);
                }
            }

            if (text.contains(",")){
                String[] sArr = text.split(",");
                System.out.println(sArr[0]);
                System.out.println(sArr[1]);
                db.put(Integer.parseInt(sArr[1]), sArr[0]);
            } else {
                for (Integer x : db.keySet()) {
                    if (db.get(x).toLowerCase().contains(text.toLowerCase())) {
                        System.out.printf("%s: %d\n", db.get(x), x);
                    }
                }
            }

        }

        sc.close();
    }
}


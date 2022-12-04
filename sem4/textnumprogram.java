import java.util.LinkedList;
import java.util.Scanner;

public class textnumprogram {
    /*
     * Реализовать консольное приложение, которое:
     * Принимает от пользователя строку вида text~num
     * Нужно рассплитить строку по ~, сохранить text в связный список на позицию
     * num.
     * Если введено print~num, выводит строку из позиции num в связном списке и
     * удаляет её из списка
     */

    public static void main(String[] args) {

        LinkedList<String> llist = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.printf(
                    "\nВведите строку формата text~num для добавления в список\nвведите show для просмотра уже введённого списка\nвведите print~num, если хотите распечатать текст и удалить его из списка\nнажмите <enter> для выхода из программы\n\nВведите ваш выбор: ");
            String text = sc.nextLine();
            if (text.equals("")) {
                break;
            }

            String[] sArr = text.split("~");

            if (text.equals("show")) {
                System.out.println(llist);
            } else if (sArr[0].equals("print")) {
                System.out.println(llist.get(Integer.parseInt(sArr[1])));
                llist.remove(Integer.parseInt(sArr[1]));
            } else {
                llist.add(Integer.parseInt(sArr[1]), sArr[0]);
            }

        }

        sc.close();

    }
}

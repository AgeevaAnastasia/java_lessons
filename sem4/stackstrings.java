import java.util.Scanner;
import java.util.Stack;

public class stackstrings {
    /*
     * Реализовать консольное приложение, которое:
     * Принимает от пользователя и “запоминает” строки.
     * Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, 
     * а первая - последней.
     * Если введено revert, удаляет предыдущую введенную строку из памяти.
     */
    public static void main(String[] args) {

        Stack<String> slist = new Stack<>();
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.printf(
                    "\nВведите строку для добавления в список\nвведите show для просмотра уже введённого списка\nвведите revert, если хотите удалить последнюю введенную строку\nнажмите <enter> для выхода из программы\n\nВведите ваш выбор: ");
            String text = sc.nextLine();
            if (text.equals("")) {
                break;
            }

            if (text.equals("show")) {
                System.out.println(slist);
            } else if (text.equals("revert")) {
                slist.pop();
            } else {
                slist.push(text);
            }

        }

        sc.close();

    }
}

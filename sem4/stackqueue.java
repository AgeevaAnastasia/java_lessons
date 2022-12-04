import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class stackqueue {
    /*
     * 1) Написать метод, который принимает массив элементов, помещает их в стэк
     * и выводит на консоль содержимое стэка.
     * 2) Написать метод, который принимает массив элементов, помещает их в очередь
     * и выводит на консоль содержимое очереди.
     */

    public static void main(String[] args) {
        System.out.println(getArray());
        List<Byte> list = new ArrayList<Byte>();
        for (byte i = 0; i < 10; i++) {
            list.add((byte) (Math.random() * 100));
        }

        var s = System.currentTimeMillis();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            queue.add(i);
        }
        System.out.println(queue);
        System.out.printf("элементы в очередь Queue добавились за %d миллисекунд\n", System.currentTimeMillis() - s);

        var ss = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d ", queue.remove());
        }
        System.out.printf("элементы из очереди Queue вывелись и удалились за %d миллисекунд\n", System.currentTimeMillis() - ss);



        var sss = System.currentTimeMillis();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < list.size(); i++) {
            stack.push(i);
        }
        System.out.println(stack);
        System.out.printf("элементы в стэк Stack добавились за %d миллисекунд\n", System.currentTimeMillis() - sss);

        var ssss = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d ", stack.pop());
        }
        System.out.printf("элементы из стэк Stack вывелись и удалились за %d миллисекунд\n", System.currentTimeMillis() - ssss);

    }

    private static Object getArray() {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (true) {
            System.out.printf("Введите число: ");
            Integer num = sc.nextInt();
            if (num.equals(0)) {
                break;
            } else {
                list.add(num);
            }

        }
        sc.close();
        return list;

    }

}

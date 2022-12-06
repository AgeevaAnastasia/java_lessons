package hw4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queuelinkedlist {
    /*
     * Реализуйте очередь с помощью LinkedList со следующими методами:
     * - enqueue() - помещает элемент в конец очереди,
     * - dequeue() - возвращает первый элемент из очереди и удаляет его,
     * - first() - возвращает первый элемент из очереди, не удаляя.
     */

     public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q); 

        enqueue(q);
        System.out.printf("Очередь с добавленным новым элементом: ");
        System.out.println(q);
        int x = dequeue(q);
        System.out.printf("Первый элемент в очереди %d удалён, очередь: ", x);
        System.out.println(q);
        int y = first(q);
        System.out.printf("Первый элемент в очереди: %d", y);
     }

    

    private static int first(Queue<Integer> q) {
        int a = q.peek();
        return a;
    }



    private static int dequeue(Queue<Integer> q) {
        int a = q.remove();
        return a;
    }

    private static void enqueue(Queue<Integer> q) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int a = sc.nextInt();
        q.add(a);
        sc.close();
    }
}

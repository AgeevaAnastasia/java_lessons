package hw4;
import java.util.Arrays;
import java.util.LinkedList;

public class reverselinkedlist {
    /*
     * Пусть дан LinkedList с несколькими элементами. 
     * Реализуйте метод, который вернет “перевернутый” список.
     */
    public static void main(String[] args) {
        LinkedList<Integer> llist = new LinkedList<Integer>(Arrays.asList(2, 5, 8, 3, 1));
        System.out.println(llist);
        reverse(llist);
        System.out.println(llist);

    }

    private static LinkedList<Integer> reverse(LinkedList<Integer> llist) {
        for (int i = 0; i < llist.size() / 2; i++) {
            Integer temp = llist.get(i);
            llist.set(i, llist.get(llist.size() - i - 1));
            llist.set(llist.size() - i - 1, temp);
        }
        return llist;
    }
}

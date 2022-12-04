import java.util.ArrayList;
import java.util.LinkedList;

public class timemeasure {
    /*
     * Замерить время, за которое 1000 элементов добавятся в ArrayList и в LinkedList
     */
        public static void main(String[] args) {

        var s = System.currentTimeMillis();

        ArrayList<Integer> alist = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            alist.add(1);
        }
        System.out.printf("Миллион элементов в ArrayList добавились за %d миллисекунд\n", System.currentTimeMillis() - s);
        

        LinkedList<Integer> llist = new LinkedList<>();

        for (int i = 0; i < 1_000_000; i++) {
            llist.add(1);
        }
        System.out.printf("Миллион элементов в LinkedList добавились за %d миллисекунд", System.currentTimeMillis() - s);
        }

        





        public static int getRandomNumber(){
            double x = (Math.random() * 99);
            int num = (int) x;
            return num;
        }
}

package sem3;

import java.util.ArrayList;
import java.util.List;

public class randnumslist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(getRandomNumber());
        }
        
        for (int o : list) {
            System.out.printf("%d ", o);
        }
        // либо просто
        System.out.println();
        System.out.println(list);

        list.sort(null); 
        System.out.println(list);
    }








    public static int getRandomNumber(){
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}

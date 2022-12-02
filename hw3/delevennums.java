package hw3;

import java.util.ArrayList;
import java.util.List;

public class delevennums {
    /*
     * Пусть дан произвольный список целых чисел, удалить из него четные числа
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(getRandomNumber());
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
            }
        }
        System.out.println(list);
    }





    public static int getRandomNumber(){
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}

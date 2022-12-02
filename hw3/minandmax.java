package hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class minandmax {
    /*
     * Задан целочисленный список ArrayList. 
     * Найти минимальное, максимальное и среднее из этого списка.
     */

     public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(getRandomNumber());
        }
        System.out.println(list);

        System.out.printf("Максимальный элемент в списке равен %d\n", Collections.max(list));
        System.out.printf("Минимальный элемент в списке равен %d", Collections.min(list));
    }

     





public static int getRandomNumber(){
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}

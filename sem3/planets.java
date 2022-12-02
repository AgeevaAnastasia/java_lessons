package sem3;

import java.util.ArrayList;
import java.util.List;

public class planets {
    /*
     * Заполнить список названиями планет Солнечной системы в произвольном порядке с
     * повторениями.
     * Вывести название каждой планеты и количество его повторений в списке.
     * Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
     */
    public static void main(String[] args) {

        String[] SunSystem = new String[] { "Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун" };
        ArrayList<String> planets = new ArrayList<String>();
        for (int i = 0; i < 15; i++) {
            planets.add(SunSystem[(int) (Math.random() * 3)]);
        }

        System.out.println(planets);

        // System.out.println(countplanet(planets, "Меркурий"));

        List<String> UniquePlanets = new ArrayList<>();
        for (String planet : planets){
            if (!UniquePlanets.contains(planet)){
                UniquePlanets.add(planet);
            }
        }

        System.out.println(UniquePlanets);

        Byte[] CountPlanets = new Byte[UniquePlanets.size()];

        for (int i = 0; i < CountPlanets.length; i++) {
            CountPlanets[i] = 0;
        }


        for (int i = 0; i < planets.size(); i++) {
            for (int j = 0; j < UniquePlanets.size(); j++) {
                if (planets.get(i).equals(UniquePlanets.get(j))) {
                    CountPlanets[j]++;
                }
            }
        }

        for (int i = 0; i < planets.size(); i++) {
            System.out.printf("Планета %s встречается в списке %d раз\n", UniquePlanets.get(i), CountPlanets[i]);
        }



    }


    public static int countplanet (ArrayList<String> planets, String planetname){
        int count = 0;
        for (String i : planets){
            if (i.equals(planetname)){
                count += 1;
            }
        }
        return count;
    }

}
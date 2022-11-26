public class restoresolution {
    /*
     * +Задано уравнение вида q + w = e, q, w, e >= 0.
     * Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
     * Требуется восстановить выражение до верного равенства.
     * Предложить хотя бы одно решение или сообщить, что его нет.
     */

    public static void main(String[] args) {
        String e = "2? + ?5 = 69";
        // String str = e.replaceAll("\\s+", "");
        // String[] arr = str.split("");

       
            for (int i = 0; i < 10; i++) {
            boolean flag = false;
            int k = 0;
            for (int j = 1; j < 10; j++) {
            if ((20 + i) + (10 * j + 5) == 69){
            flag = true;
            k = j;
            break;
            }
            }
            if (flag){
            System.out.printf("Уравнение %s восстановлено до вида 2%d + %d5 = 69", e, i,
            k);
            }
            }

        }
    

}

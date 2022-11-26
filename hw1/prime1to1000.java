public class prime1to1000 {
    /*
     * Вывести все простые числа от 1 до 1000
     */
    public static void main(String[] args) {
        int n = 1000;
        for (int i = 1; i <= n; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime == true)
                System.out.print(i + " ");
        }

    }

}

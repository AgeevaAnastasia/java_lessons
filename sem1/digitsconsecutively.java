public class digitsconsecutively {
    /*
     * Дан массив двоичных чисел, например [1,1,0,1,1,1],
     * вывести максимальное количество подряд идущих 1.
     */
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1 };
        int count = 0;
        int countmax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                count++;
            else
                count = 0;
            if (count > countmax) {
                countmax = count;
            }
        }
        System.out.println(countmax);
    }
}

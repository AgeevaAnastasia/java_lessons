import java.io.FileWriter;
import java.util.Arrays;


public class bubble {
    /*
     * Реализуйте алгоритм сортировки пузырьком числового массива,
     * результат после каждой итерации запишите в лог-файл.
     */

    public static void main(String[] args) {

        
        int[] arr = { 3, 5, 1, 7, 3, 9, 2, 0 };
        for (int j = arr.length - 1; j >= 1; j--) {
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    
                }

            }
            try (FileWriter f = new FileWriter("log.txt", true)) {
                f.write(Arrays.toString(arr));
                f.write("\n");
            } catch (Exception e) {
                e.printStackTrace();
        }
        
        System.out.println(Arrays.toString(arr));

        


    }

}
}

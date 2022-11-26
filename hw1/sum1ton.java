public class sum1ton {
    /*
     * Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
     * n! (произведение чисел от 1 до n)
     */

    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int fact = 1;
        for (int i = 1; i < n + 1; i++) {
            sum += i;
            fact *= i;
        }

        System.out.printf("Сумма чисел от 1 до %d равна %d\n%d! равен %d", n, sum, n, fact);

    }
}

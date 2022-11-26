public class program2 {
    /*
     * %d - для вывода целочисленных значений
     * %x - для вывода шестнадцатиричных чисел
     * %f - для вывода чисел с плавающей
     * %e - для вывода чисел в экспоненциальной форме, например, 3.1415e+01
     * %c - для вывода одиночного символа
     * %s - для вывода строковых значени
     */
    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = a + b;
        String res = String.format("%d + %d = %d \n", a, b, c);
        System.out.printf("%d + %d = %d \n", a, b, c);
        System.out.println(res);
    }
}

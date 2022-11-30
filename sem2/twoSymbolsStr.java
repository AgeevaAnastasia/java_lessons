import java.util.Scanner;

/*
 * 
 */
public class twoSymbolsStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите чётное число n: ");
        String str1 = sc.nextLine();
        int n = Integer.parseInt(str1);
        System.out.printf("Введите символ с1: ");
        String s1 = sc.nextLine();
        System.out.printf("Введите символ с2: ");
        String s2 = sc.nextLine();
        sc.close();

        StringBuilder sres = new StringBuilder();

        // сработает и с нечетным числом
        // for (int i = 1; i <= n; i++) {
        //     if (i % 2 == 0){
        //         sres.append(s1);
        //     }
        //     else{
        //         sres.append(s2);
        //     }
        // }

        s1 += s2;

        for (int i = 1; i <= n / 2; i++) {
            sres.append(s1);
        }

        System.out.println(sres);
    }
}

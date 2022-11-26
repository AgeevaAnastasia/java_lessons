import java.util.Scanner;
public class program1 {
    public static void main(String[] args) {
        Scanner jScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = jScanner.nextLine();
        System.out.printf("Привет, %s!\n", name);
        jScanner.close();

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag  = iScanner.hasNextInt();
        System.out.println(flag);
        int i = iScanner.nextInt();
        System.out.println(i);
        iScanner.close();
    }
}

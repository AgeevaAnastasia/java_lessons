import java.util.Scanner;

public class calc {
    /*
     * Реализовать простой калькулятор + - / * 
     */

     public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("число 1: ");
        String digit1 = iScanner.nextLine();
        System.out.print("математическое действие: ");
        String sign = iScanner.nextLine();
        System.out.print("число 2: ");
        String digit2 = iScanner.nextLine();
        iScanner.close();
        
        int a = Integer.parseInt(digit1.trim());
        int b = Integer.parseInt(digit2.trim());
        
        double res = 0;
        switch (sign) {
            case "+":
            res = a + b;
                break;
            case "-":
                res = a - b;
                break;      
            case "*":
                res = a * b;
                break;  
            case "/":
                res = (double)a / b;
                break;
            default:
                break;
        }

        

        System.out.printf("%d %s %d = %f", a, sign, b, res);

        


     }
}

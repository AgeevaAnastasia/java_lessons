Семинар 2.

ДЗ 1. Дана строка sql-запроса"select * from students where ".Сформируйте часть WHERE этого запроса,используя StringBuilder.Данные для фильтрации приведены ниже в виде json строки.Если значение null,то параметр не должен попадать в запрос.

Параметры для фильтрации:{"name":"Ivanov","country":"Russia","city":"Moscow","age":"null"}

public class MakeQuery {
    public static final String QUERY = "select * from students where ";
    public static final String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";

    public static void main(String[] args) {
        String paramsNew = PARAMS.replace('{', ' ').replace('}', ' ');
        String[] params = paramsNew.split(",");
        StringBuilder stringBuilder = new StringBuilder(QUERY);
        for (int i = 0; i < params.length; i++) {
            String[] elements = params[i].replace('"', ' ').split(":");
            if (!"null".equals(elements[1].trim())) {
                stringBuilder.append(elements[0].trim()).append("=").append("'").append(elements[1].trim()).append("'");
                if (i < params.length - 2)
                    stringBuilder.append(" and ");
            }
        }
        System.out.println(stringBuilder);
    }
}

ДЗ 2.

Реализуйте алгоритм
сортировки пузырьком
числового массива, результат
после каждой
итерации запишите
в лог-файл
.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Arrays;

public class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void main(String[] args) {
        try {
            log = new File("log.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log);
            int[] mas = { 11, 3, 14, 16, 7 };
            bubbleSort(mas);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static int[] bubbleSort(int[] mas) {
        boolean isSorted = false;
        int buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;
                    buffer = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buffer;
                }
            }
            // System.out.println(Arrays.toString(mas));
            logStep(Arrays.toString(mas));
        }
        return mas;
    }

    public static void logStep(String note) {
        try {
            fileWriter.write(new Timestamp(System.currentTimeMillis()) + " " + note + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }}

    ДЗ 3.

    Дана json

    строка (можно сохранить в файл и читать из файла)

[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: 
Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода:

Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.


3.	public class ParseJSON {    
    private static final String JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +            
    "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +            
    "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";    
    private static final String ELEMENT1 = "Студент ";    
    private static final String ELEMENT2 = " получил ";    
    private static final String ELEMENT3 = " по предмету ";    
    public static void main(String[] args) {        
        StringBuilder sb = new StringBuilder();        
        String newJSON = JSON.replaceAll("\\{", "").replaceAll("\\}", "").replaceAll("\"", "").replace('[', ' ').replace(']', ' ');        
        //System.out.println(newJSON);        
        String[] parts = newJSON.split(",");        
        for (String part : parts){            
            String[] params = part.split(":");            
            if("фамилия".equals(params[0].trim())) 
            {                
                sb = new StringBuilder(ELEMENT1).append(params[1]);            
            }            else if("оценка".equals(params[0].trim())) sb.append(ELEMENT2).append(params[1]);            
            else if("предмет".equals(params[0].trim())) {                
                sb.append(ELEMENT3).append(params[1]);                
                System.out.println(sb);            }        }    }}


                ДЗ 4 *.
                К калькулятору из предыдущего дз добавить логирование.
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Scanner;

public class Calculator {
    private static File log;
    private static FileWriter fileWriter;

    public static void main(String[] args) {
        try {
            log = new File("log.txt");
            log.createNewFile();
            fileWriter = new FileWriter(log);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number...");
            int a = scanner.nextInt();
            logStep("User entered the first operand = " + a);
            System.out.println("Enter the operator (+ - * /)...");
            char op = scanner.next().charAt(0);
            logStep("User entered the operation = " + op);
            System.out.println("Enter the second number...");
            int b = scanner.nextInt();
            logStep("User entered the first operand = " + b);
            int res;
            switch (op) {
                case '+':
                    res = add(a, b);
                    logStep("Result is " + res);
                    // System.out.println(a + " + " + b + " = " + add(a, b));
                    break;
                case '-':
                    res = minus(a, b);
                    logStep("Result is " + res);
                    // System.out.println(a + " - " + b + " = " + minus(a, b));
                    break;
                case '*':
                    res = mult(a, b);
                    logStep("Result is " + res);
                    // System.out.println(a + " * " + b + " = " + mult(a, b));
                    break;
                case '/':
                    res = divide(a, b);
                    logStep("Result is " + res);
                    // System.out.println(a + " / " + b + " = " + res);
                    break;
                default:
                    logStep("Wrong operation!");
                    // System.out.println("Wrong operation!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int divide(int a, int b) {
        if (b != 0)
            return a / b;
        return -1;
    }

    private static int mult(int a, int b) {
        return a * b;
    }

    private static int minus(int a, int b) {
        return a - b;
    }

    private static int add(int a, int b) {
        return a + b;
    }

    public static void logStep(String note) throws IOException {
        fileWriter.write(new Timestamp(System.currentTimeMillis()) + " " + note + "\n");
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class jsonoutput {
    /*
     * Дана json строка (можно сохранить в файл и читать из файла)
     * [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":
     * "Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка"
     * :"5","предмет":"Физика"}]
     * Написать метод(ы), который распарсит json и, используя StringBuilder, создаст
     * строки вида:
     * Студент [фамилия] получил [оценка] по предмету [предмет].
     */

    public static void main(String[] args) {
        String inputString = getDataFromFile("json_students.txt");
        String inputstr = inputString.replace('"', ' ');
        inputstr = inputstr.replace(':', ',');
        inputstr = inputstr.replace('}', ' ');
        inputstr = inputstr.replace('{', ' ');
        inputstr = inputstr.replace('[', ' ');
        inputstr = inputstr.replace(']', ' ');
        inputstr = inputstr.replaceAll("\\s+","");

        ArrayList<String> list = new ArrayList<>(List.of(inputstr.split(",")));  

        String output = "";
        for (int i = 1; i < list.size(); i += 6) {
            output += "Студент ";
            output += list.get(i);
            output += " получил ";
            output += list.get(i + 2);
            output += " по предмету ";
            output += list.get(i + 4);
            output+=". \n";
            }
        
        System.out.println(output);

    }

    private static String getDataFromFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return "";
        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;

public class sqlwhere {
    /*
     * Дана строка sql-запроса "select * from students where ".
     * Сформируйте часть WHERE этого запроса, используя StringBuilder.
     * Данные для фильтрации приведены ниже в виде json строки.
     * Если значение null, то параметр не должен попадать в запрос.
     * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
     * str = "name = 'Ivanov' AND country = 'Russia' AND city = 'Moscow'"
     */

     public static void main(String[] args) {

        String inputString = getDataFromFile("json.txt");
        String inputstr = inputString.replace('"', ' ');
        inputstr = inputstr.replace(':', ',');
        inputstr = inputstr.replace('}', ' ');
        inputstr = inputstr.replace('{', ' ');
        inputstr = inputstr.replaceAll("\\s+","");
   

        ArrayList<String> list = new ArrayList<>(List.of(inputstr.split(",")));        
       
        String where = "";
        where += '"';
        for (int i = 1; i < list.size(); i+=2) {
            if (list.get(i) != null){
                where += list.get(i - 1);
                where += " = '";
                where += list.get(i);
                where += "' AND ";
            }
        }
        where += '"';
        System.out.println(where);
     }

    

    private static String getDataFromFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                        return br.readLine();
                    }
                    catch (Exception exception) {
                        System.out.println(exception.getMessage());
                        return "";
                    }
                }
    

    
}

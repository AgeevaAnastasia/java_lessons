import java.io.FileWriter;
import java.io.IOException;

public class files {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line1");
            fw.append('\n');
            fw.append('2');
            fw.append("\n");
            fw.write("line3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

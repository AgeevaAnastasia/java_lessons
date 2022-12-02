import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class catalogContents {
    public static void main(String[] args) {

        File dir = new File(".");
        System.out.println(dir.getAbsolutePath());
        File[] filesList = dir.listFiles();
        List<String> l = new ArrayList<>();
        
        for (File f: filesList) {
            if (f.isFile()) {
                System.out.printf("  %s\n", f.getName());
            } else {
                System.out.println(f.getName());
            }
        }

        try (FileWriter fw = new FileWriter("new.txt", false)){
            for (File f: filesList) {
                fw.write(f.toString());
                fw.append("\n");
        }
    }
        catch (Exception e) {
            e.printStackTrace();
            }
            finally {
            System.out.println();
            }


    }


        String pathfile = "C:\\Users\\Acer\\YandexDisk\\developer_education\\JAVA\\sem2\\new.txt";
        // String line = "empty";
        // try {
        // File fl = new File(pathfile);

        // if (fl.createNewFile()) {
        // System.out.println("file.created");
        // }
        // else {
        // BufferedReader bufReader = new BufferedReader(new FileReader(fl));
        // System.out.println("file.existed");
        // line = bufReader.readLine();
        // bufReader.close();
        // }
        // }
        // catch (Exception e) {
        // // e.printStackTrace();
        // }
        // finally {
        // System.out.println(line);
        // }

    

    // public static void saveDir(File[] file) {
       
    //     // String pathProject = System.getProperty("user.dir");
    //     // String pathFile = pathProject.concat("/file.txt");
    // }
}


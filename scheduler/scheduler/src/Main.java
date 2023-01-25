import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        UI ui;
        String filename = "scheduler.dat";
        FileHandler fileHandler = new FileHandler(filename);
        Schedule schedule = new Schedule();
        Task firstTask = new Task("00.00", "New Year");
        schedule.addTaskToDate("01.01", firstTask);
//        Presenter presenter = new Presenter();
        Presenter presenter = new Presenter(schedule);
        ui = new UI (presenter);
        ui.start();

    }
}
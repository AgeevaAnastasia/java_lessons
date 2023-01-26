import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class UI {
    private Schedule schedule;
    private Presenter presenter;
    private Writable writable;
    List<Commands> commandsList;

    Scanner iScanner;

    public UI(Presenter presenter) throws IOException, ClassNotFoundException {
        this.presenter = presenter;
        presenter.setUI(this);
        schedule = this.presenter.readSchedule();
        commandsList = new ArrayList<>();
        iScanner = new Scanner(System.in);
        this.writable = writable;
    }

    public Presenter getPresenter() {
        return presenter;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void printSchedule(Schedule schedule) {
        System.out.println(schedule.getAllTasks());
    }

    public Schedule readSchedule() throws IOException, ClassNotFoundException {
        if (writable != null) {
            try {
                if (writable.load() == null) {
                    System.out.println("Планировщика в файле нет! Создан новый планировщик.");
                    return new Schedule();
                } else {
                    System.out.println("Планировщик загружен из файла");
                    return (Schedule) writable.load();
                }
            } catch (Exception ex) {
                System.out.println("Ошибка!");;
            }
        } else {
            System.out.println("Файл не загружен!");
            return new Schedule();
        }
        return new Schedule();
    }
    public void printDate(String currentDate, Date date) {
        if (date.getTasks().size() > 0) {
            System.out.printf("Задачи на %s:\n", currentDate);
            System.out.println(date);
        } else {
            System.out.printf("Задач на %s нет.\n", currentDate);
        }
    }

    public void printTask(String foundTask) {
        System.out.println(foundTask);
    }

    public String getDate() {
        String date;
        System.out.print("Введите дату в формате 'день.месяц' (например, 01.12): ");
        date = iScanner.nextLine();
        return date;
    }



    public Task getTask(boolean filled) {
        String event;
        String time = "";
        if (filled) {
            System.out.print("Введите время задачи в формате 'час.минута' (например, 12.30): ");
            time = iScanner.nextLine();
            }

        System.out.print("Введите описание задачи: ");
        event = iScanner.nextLine();
        return new Task(time, event);

    }
    public void start() throws IOException {

        commandsList.add(new Command_AddTask(this));
        commandsList.add(new Command_DeleteTask(this));
        commandsList.add(new Command_FindEvent(this));
        commandsList.add(new Command_GetSchedule(this));
        commandsList.add(new Command_GetDateTasks(this));
        commandsList.add(new Command_SaveAndExit(this));

        while (true) {
            System.out.println("Выберите действие:");
            for (int i = 0; i < commandsList.size(); i++) {
                System.out.println(i + " - " + commandsList.get(i).description());
            }
            String str = iScanner.nextLine();
                int choice = Integer.parseInt(str);
                if ((choice >= 0) & (choice < commandsList.size())) commandsList.get(Integer.parseInt(str)).execute();
                else {
                    System.out.println("Неверный ввод, попробуйте снова");
                }
        }
    }


}

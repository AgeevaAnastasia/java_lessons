import java.io.IOException;

public class Presenter {
    private Schedule schedule;
    private UI ui;
    private Writable writable;

    public Presenter(Schedule schedule) {
        this.schedule = schedule;
    }


    public UI getUI() {
        return ui;
    }

    public void setUI(UI ui) {
        this.ui = ui;
    }

    public void saveSchedule() throws IOException {
        if (writable != null)
            writable.save(schedule);
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



    public void getDateTasks() {
        String currentDate = ui.getDate();
        Date date = schedule.getDateTasks(currentDate);
        ui.printDate(currentDate, date);
    }
    public void addTask() {
        schedule.addTaskToDate(ui.getDate(), ui.getTask(true));
    }

    public void findTask() {
        Task task = ui.getTask(false);
        String event = task.getEvent();
        String foundTask = schedule.findTask(event);
        if (foundTask.length() == 0) {
            foundTask = "Задача " + event + " не найдена";
        } else {
            foundTask = "Найдено:\n" + foundTask;
        }
        ui.printTask(foundTask);
    }

    public void deleteTask() {
        Task task = ui.getTask(false); //false
        String event = task.getEvent();
        String deleteTask;
        if (event.length() == 0) {
            deleteTask = "Задача " + event + " не найдена.";
        } else {
            deleteTask = "Удалена задача " + event;
        }
        ui.printTask(deleteTask);
    }
    public void printSchedule(Schedule schedule) {
        getUI().printSchedule(schedule);
    }



}

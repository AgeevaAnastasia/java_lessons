import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Schedule implements Serializable {

    private Map<String, Date> dates;



    public Schedule() {
        this.dates = new HashMap<>();
    }

    public void addTaskToDate(String date, Task task) {
        if (!dates.containsKey(date)) {
            dates.put(date, new Date());
        }
        dates.get(date).addTask(task);

    }


    public Date getDateTasks(String findDate) {
        if (dates.containsKey(findDate)) {
            return dates.get(findDate);
        } else {
            return new Date();
        }
    }


    public String findTask(String event) {
        String result = "";
        for (String currentDate : dates.keySet()) {
            Date day = dates.get(currentDate);
            for (Task task : day.getTasks()) {
                //if (task.getEvent().equalsIgnoreCase(event))
                result += "Дата: " + currentDate.toString() + ", время:" + task.getTime().toString() + ", задача: " + task.getEvent().toString() + "\n";
            }
        }
        return result;
    }


    public void deleteTask(String event) {
        Iterator<String> dateIterator = dates.keySet().iterator();
        for (Iterator<String> di = dateIterator; di.hasNext(); ) {
            String currentDate = di.next();
            Date date = dates.get(currentDate);

            Iterator<Task> taskIterator = date.getTasks().iterator();
            for (Iterator<Task> ti = taskIterator; ti.hasNext(); ) {
                Task task = ti.next();
            }

        }

    }

    @Override
    public String toString() {
        String result = "";
        for (String date : dates.keySet()) {
            result += "Дата: " + date.toString() + "." + dates.get(date).toString();
        }
        return result;
    }
}

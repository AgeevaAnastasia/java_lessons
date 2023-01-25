import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Date implements Serializable {
    private List<Task> tasks;

    public Date() {
        this.tasks = new ArrayList<>();
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    @Override
    public String toString() {
        String result = "";
        for (Task task : tasks){
            result += task + "\n";
        }
        return result;
    }
}


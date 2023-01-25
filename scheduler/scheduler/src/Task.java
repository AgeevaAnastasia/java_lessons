import java.io.Serializable;

public class Task implements Serializable {
    private String time;
    private String event;

    public Task(String time, String event) {
        this.time = time;
        this.event = event;
    }

    public String getTime() {
        return time;
    }

    public String getEvent() {
        return event;
    }

    @Override
    public String toString() {
        return String.format("Время: %s\n   задача: %s\n\n", time, event);
    }

}

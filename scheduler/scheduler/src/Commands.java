import java.io.IOException;

public interface Commands {
    void execute() throws IOException;
    String description();
}

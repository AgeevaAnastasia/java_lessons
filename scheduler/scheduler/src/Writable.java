
import java.io.IOException;
import java.io.Serializable;

public interface Writable {
    void save(Serializable serializable) throws IOException;

    Schedule load() throws IOException, ClassNotFoundException;
}
import java.io.FileNotFoundException;

public class SubClass extends SuperClass {
    public void start() throws FileNotFoundException {
        throw new FileNotFoundException("Not able to start");
    }
}

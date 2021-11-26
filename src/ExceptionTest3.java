import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest3  {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("Hillel");
        }catch (FileNotFoundException ex){
            System.out.println("Oops, FileNotFoundException caught");
        }catch (IOException e){
            System.out.println("IOEXCEPTION");
        }
    }
}

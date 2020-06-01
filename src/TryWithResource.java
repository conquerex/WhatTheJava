import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Jongkook
 * @date : 01/06/2020
 */

public class TryWithResource {
    public static void main(String[] args) {
        // Before
        FileInputStream stream = null;
        try {
            stream = new FileInputStream("");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // After : FileInputStream처럼 AutoCloseable 구현체만 들어갈 수 있다.
        try (FileInputStream stream2 = new FileInputStream("")) {
            //
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package creational.singleton;

import java.io.File;
import java.io.IOException;

public class Singleton {

    private static File instance;

    /**
     * Thread safe version for singleton
     * @return unique instance
     */
    public synchronized static File getInstance() {
        if (instance == null) {
            try {
                instance = File.createTempFile("my-file", ".temp");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return instance;
    }
}

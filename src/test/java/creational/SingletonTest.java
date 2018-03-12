package creational;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class SingletonTest {

    @Test
    public void dummy() {
        File file1 = Singleton.getInstance();
        File file2 = Singleton.getInstance();
        assertEquals(file1, file2);
    }

}

package creational.singleton;

import org.junit.Test;

import java.io.File;

import static junit.framework.TestCase.assertSame;

public class SingletonTest {

    @Test
    public void getInstance_Should_Return_EveryTime_The_Same_Instance() {
        File file1 = Singleton.getInstance();
        File file2 = Singleton.getInstance();
        assertSame(file1, file2);
    }

}

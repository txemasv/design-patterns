package behavioral.observer;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class ObserverTest {

    private Log log;
    private ExecutorService executorService;
    private List<Observer> observers;

    @Before
    public void setUp() {
        log = new Log();
        executorService = Executors.newSingleThreadExecutor();
        observers = new ArrayList<>();
    }

    @Test
    public void download_Should_Notify_UserInterface_When_DownloadAsset_IsCompleted() {
        Download download = new Download(observers, executorService);
        UserInterface userInterface = new UserInterface(log);

        download.subscribe(userInterface);

        String assetUri = "https://example.org/resource.txt";
        download.downloadAsset(assetUri);

        executorServiceJoinAll();

        assertEquals("Download finished!", log.getMessage());
    }

    private void executorServiceJoinAll() {
        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

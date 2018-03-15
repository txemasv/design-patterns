package behavioral.observer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ObserverTest {

    private Log log;

    @Before
    public void setUp() {
        log = new Log();
    }

    @Test
    public void download_Should_Notify_UserInterface_When_DownloadAsset_finish() {
        Download download = new Download();
        UserInterface userInterface = new UserInterface(log);

        download.subscribe(userInterface);

        String assetUri = "https://example.org/resource.txt";
        download.downloadAsset(assetUri);

        assertEquals("Download finished!", log.getMessage());
    }
}

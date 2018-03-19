package structural.adapter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdapterTest {

    @Test
    public void playTV_Using_Adapter_Should_Connect_To_WIFI() {
        WifiTVAdapter adapter = new WifiTVAdapter();
        adapter.playTV();

        boolean isConnectedToWIFI = adapter.getConnection().isConnected();
        assertEquals(true, isConnectedToWIFI);
    }
}

package structural.adapter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdapterTest {

    @Test
    public void playTV_Using_Adapter_Should_Connect_To_WIFI() {
        PlugAdapter adapter = new PlugAdapter();
        adapter.playTV();

        boolean isConnectedToWIFI = adapter.getWifi().isConnected();
        assertEquals(true, isConnectedToWIFI);
    }
}

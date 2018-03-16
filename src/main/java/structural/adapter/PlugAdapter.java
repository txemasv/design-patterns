package structural.adapter;

public class PlugAdapter implements CableTV {

    private Wifi wifi = new Wifi();

    @Override
    public void playTV() {
        wifi.connect();
        if (wifi.isConnected()) {
            System.out.println("Playing TV");
        }
    }

    public Wifi getWifi() {
        return wifi;
    }
}

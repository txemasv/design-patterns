package structural.adapter;

public class Player implements WifiTV {
    private boolean isConnected = false;

    public void connect() {
        try {
            //do stuff to connect
            System.out.println("Connected to WIFI");
            isConnected = true;

        } catch (Exception ex) {
            System.out.println("Problem with WIFI connection");
        }
    }

    public boolean isConnected() {
        return isConnected;
    }

    @Override
    public void playContent() {
        System.out.println("Playing content");
    }

}
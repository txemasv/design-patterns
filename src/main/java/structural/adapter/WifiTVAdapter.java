package structural.adapter;

public class WifiTVAdapter implements CableTV {

    private WifiTV connection = new Player();

    @Override
    public void playTV() {
        connection.connect();
        if (connection.isConnected()) {
            connection.playContent();
            System.out.println("Playing TV");
        }
    }

    public WifiTV getConnection() {
        return connection;
    }
}

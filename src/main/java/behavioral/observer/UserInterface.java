package behavioral.observer;

public class UserInterface implements Observer {

    private Log log;

    public UserInterface(Log log) {
        this.log = log;
    }

    @Override
    public void update() {
        String message = "Download finished!";
        log.output(message);
    }
}

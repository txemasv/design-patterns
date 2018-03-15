package behavioral.observer;

public class Log {
    private String message;

    public void output(String message) {
        this.message = message;
        System.out.println(message);
    }

    public String getMessage() {
        return message;
    }
}

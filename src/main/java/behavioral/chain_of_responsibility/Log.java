package behavioral.chain_of_responsibility;

public class Log {
    private String message;

    public void player(String player) {
        message = "";
        if (player != null) {
            message = player + " selected";
            System.out.println(message);
        }
    }

    public String getMessage() {
        return message;
    }
}

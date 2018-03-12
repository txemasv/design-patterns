package behavioral.strategy;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class XmlTimeNow implements TimeNow {

    private Clock clock;

    XmlTimeNow(Clock clock) {
        this.clock = clock;
    }

    @Override
    public String output() {
        LocalDateTime now = LocalDateTime.now(clock);

        String date = now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        return "<now><time>" + date + "</time><date>" + time + "</date></now>";
    }
}
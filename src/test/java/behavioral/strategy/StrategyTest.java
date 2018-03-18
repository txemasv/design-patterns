package behavioral.strategy;

import org.junit.Before;
import org.junit.Test;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;

public class StrategyTest {

    private Clock clock;
    private String date;
    private String time;

    @Before
    public void setUp() {
        LocalDateTime now = LocalDateTime.now();
        clock = Clock.fixed(now.atZone(Clock.systemDefaultZone().getZone()).toInstant(), Clock.systemDefaultZone().getZone());
        date = now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    @Test
    public void output_Should_Return_Date_In_JsonFormat() {
        TimeNow now = new TimeNowJson(clock);
        System.out.println(now.output());
        String outputShouldReturn = "{\"date\":\"" + date + "\", \"time\":\"" + time + "\"}";
        assertEquals(outputShouldReturn, now.output());
    }

    @Test
    public void output_Should_Return_Date_In_XmlFormat() {
        TimeNow now = new TimeNowXml(clock);
        System.out.println(now.output());
        String outputShouldReturn = "<now><time>" + date + "</time><date>" + time + "</date></now>";
        assertEquals(outputShouldReturn, now.output());
    }
}

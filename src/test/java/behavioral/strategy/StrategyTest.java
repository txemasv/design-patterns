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
        clock = Clock.systemDefaultZone();
        LocalDateTime now = LocalDateTime.now(clock);
        date = now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    @Test
    public void output_Should_Return_Date_In_JsonFormat() {
        JsonTimeNow json = new JsonTimeNow(clock);
        System.out.println(json.output());
        String outputShouldReturn = "{\"date\":\"" + date + "\", \"time\":\"" + time + "\"}";
        assertEquals(outputShouldReturn, json.output());
    }

    @Test
    public void output_Should_Return_Date_In_XmlFormat() {
        XmlTimeNow xml = new XmlTimeNow(clock);
        System.out.println(xml.output());
        String outputShouldReturn = "<now><time>" + date + "</time><date>" + time + "</date></now>";
        assertEquals(outputShouldReturn, xml.output());
    }
}

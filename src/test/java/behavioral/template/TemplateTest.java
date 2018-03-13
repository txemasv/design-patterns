package behavioral.template;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TemplateTest {
    @Test
    public void makeHappy_Man_Should_Complete_3_Requirements() {
        LoveAMan loveAMan = new LoveAMan();
        loveAMan.makeHappy();
        assertEquals(3, loveAMan.getCompleted());
    }

    @Test
    public void makeHappy_Woman_Should_Complete_50_Requirements() {
        LoveAWoman loveAWoman = new LoveAWoman();
        loveAWoman.makeHappy();
        assertEquals(50, loveAWoman.getCompleted());
    }
}

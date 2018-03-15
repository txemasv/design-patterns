package behavioral.chain_of_responsibility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChainOfResponsibilityTest {

    private Log log;

    @Before
    public void setUp() {
        log = new Log();
    }

    @Test
    public void existentMovie_In_First_PlayerInChain_Should_Play_Movie() {
        ChainItem netflix = new Netflix(log);
        ChainItem appleTv = new AppleTv(log);

        netflix.setNext(appleTv);

        netflix.play("0000-0004-A36E-0000-V-0000-0000-A");

        assertEquals("Netflix selected", log.getMessage());
    }

    @Test
    public void notExistentMovie_In_First_PlayerInChain_Should_Delegate_In_SecondPlayer() {
        ChainItem netflix = new Netflix(log);
        ChainItem appleTv = new AppleTv(log);
        ChainItem hardDrive = new HardDrive(log);

        netflix.setNext(appleTv);
        appleTv.setNext(hardDrive);

        netflix.play("0000-0004-A36E-0000-V-0000-0000-E");

        assertEquals("AppleTv selected", log.getMessage());
    }

    @Test
    public void notExistentMovie_In_FirstAndSecond_PlayerInChain_Should_Delegate_In_ThirdPlayer() {
        ChainItem netflix = new Netflix(log);
        ChainItem appleTv = new AppleTv(log);
        ChainItem hardDrive = new HardDrive(log);

        netflix.setNext(appleTv);
        appleTv.setNext(hardDrive);

        netflix.play("0000-0004-11CB-000A-Q-0000-0000-I");

        assertEquals("HardDrive selected", log.getMessage());
    }

    @Test
    public void notExistentMovie_In_Any_PlayerInChain_Should_Output_Message() {
        ChainItem netflix = new Netflix(log);
        ChainItem appleTv = new AppleTv(log);
        ChainItem hardDrive = new HardDrive(log);

        netflix.setNext(appleTv);
        appleTv.setNext(hardDrive);

        netflix.play("NOT-EXISTENT-ISAN");

        assertEquals("", log.getMessage());
    }

}

package behavioral.state;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class StateTest {

    @Test
    public void startGame_Should_start_state_FlyingState() {
        FlappyBird bird = new FlappyBird();
        bird.startGame();

        assertThat(bird.getState(),instanceOf(FlyingState.class));
    }

    @Test
    public void collision_Should_change_FlyingState_to_IdleState() {
        FlappyBird bird = new FlappyBird();
        bird.startGame();
        bird.collision();

        assertThat(bird.getState(),instanceOf(IdleState.class));
    }

    @Test
    public void animate_In_FlyingState_Should_Set_isAlive_True() {
        FlappyBird bird = new FlappyBird();
        bird.startGame();
        bird.animate();

        assertEquals(true, bird.isAlive);
    }

    @Test
    public void animate_In_IdleState_Should_Set_isAlive_False() {
        FlappyBird bird = new FlappyBird();
        bird.startGame();
        bird.collision();
        bird.animate();

        assertEquals(false, bird.isAlive);
    }
}

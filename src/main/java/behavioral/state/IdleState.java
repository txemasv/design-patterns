package behavioral.state;

public class IdleState implements State {
    @Override
    public void animate(FlappyBird bird) {
        bird.isAlive = false;
        System.out.println("Playing Idle Animation");
    }
}

package behavioral.state;

public class FlyingState implements State {
    @Override
    public void animate(FlappyBird bird) {
        bird.isAlive = true;
        System.out.println("Playing Flying Animation");
    }
}

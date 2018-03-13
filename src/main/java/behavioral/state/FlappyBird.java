package behavioral.state;

public class FlappyBird {
    private State state = new FlyingState();
    public boolean isAlive;

    public void animate() {
        state.animate(this);
    }

    public void startGame() {
        state = new FlyingState();
    }

    public void collision() {
        state = new IdleState();
    }

    public State getState() {
        return state;
    }
}

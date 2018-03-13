package behavioral.template;

public abstract class HappyMan extends Happy {

    @Override
    public void makeHappy() {
        feedHim();
        sleepWithHim();
        leaveHimInPeace();
    }

    abstract void feedHim();
    abstract void sleepWithHim();
    abstract void leaveHimInPeace();
}

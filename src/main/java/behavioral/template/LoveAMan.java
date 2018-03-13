package behavioral.template;

class LoveAMan extends HappyMan {

    private int completed = 0;

    @Override
    void feedHim() {
        completed++;
    }

    @Override
    void sleepWithHim() {
        completed++;
    }

    @Override
    void leaveHimInPeace() {
        completed++;
    }

    public int getCompleted() {
        return completed;
    }

}
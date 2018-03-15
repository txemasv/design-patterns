package behavioral.observer;

interface Observable {
    void subscribe(Observer observer);
    void unSubscribe(Observer observer);
    void notifyObserver();
}

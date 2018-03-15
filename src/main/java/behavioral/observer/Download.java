package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Download implements Observable {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribe(Observer observer) {
        int index = observers.indexOf(observer);
        observers.remove(index);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void downloadAsset(String uri) {
        System.out.println("Downloading asset '" + uri + "'...");
        //when asset download is completed:
        notifyObserver();
    }
}

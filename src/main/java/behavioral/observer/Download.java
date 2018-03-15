package behavioral.observer;

import java.util.List;
import java.util.concurrent.ExecutorService;

public class Download implements Observable {

    private List<Observer> observers;
    private ExecutorService executor;

    public Download(List<Observer> observers, ExecutorService executor) {
        this.executor = executor;
        this.observers = observers;
    }

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
        System.out.println("Download asset '" + uri);
        Runnable run = () -> {
            System.out.println("Downloading ...");
            //do stuff to download file,
            //when asset download is completed
            notifyObserver();
        };
        executor.submit(run);
    }
}

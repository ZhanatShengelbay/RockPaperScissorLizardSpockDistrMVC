package it.polimi.ingsw.view;

import java.util.ArrayList;
import java.util.List;

public class Observable<T> {

    private List<Observer<T>> observers = new ArrayList<>();

    public void addObserver(Observer<T> observer){
        synchronized (observer){
            observers.add(observer);
        }
    }

    public void removeObserver(Observer<T> observer){
        synchronized (observer){
            observers.remove(observer);
        }
    }

    public void notify(T message){
        synchronized (observers){
            for (Observer<T> observer: observers){
            observer.update(message);
            }
        }
    }
}

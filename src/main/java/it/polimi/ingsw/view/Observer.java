package it.polimi.ingsw.view;

public interface Observer<T> {
    void update(T message);
}

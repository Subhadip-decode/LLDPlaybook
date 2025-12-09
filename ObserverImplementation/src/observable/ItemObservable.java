package observable;

import observer.ItemObserver;

public interface ItemObservable {
    void add(ItemObserver itemObserver);
    void remove(ItemObserver itemObserver);
    void notifyObservers();
    int getItem();
    void setItem(int stock);
}

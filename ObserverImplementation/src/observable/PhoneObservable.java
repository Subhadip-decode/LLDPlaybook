package observable;

import observer.ItemObserver;

import java.util.ArrayList;
import java.util.List;

public class PhoneObservable implements ItemObservable{
    private int stock = 0;
    private final List<ItemObserver> observerList = new ArrayList<>();

    @Override
    public void add(ItemObserver itemObserver) {
        observerList.add(itemObserver);
    }

    @Override
    public void remove(ItemObserver itemObserver) {
        observerList.remove(itemObserver);
    }

    @Override
    public void notifyObservers() {
        for (ItemObserver itemObserver : observerList) {
            itemObserver.update();
        }
    }

    @Override
    public int getItem() {
        return this.stock;
    }

    @Override
    public void setItem(int stock) {
        if(this.stock==0){
            this.stock += stock;
            notifyObservers();
        }
        else
            this.stock += stock;
    }
}

package observer;

import observable.ItemObservable;
import observable.PhoneObservable;

public class MobileNotificationObserver implements ItemObserver{
    private final ItemObservable phoneObservable;
    private final String phone;
    public MobileNotificationObserver(String phone, ItemObservable phoneObservable){
        this.phoneObservable = phoneObservable;
        this.phone = phone;
    }
    @Override
    public void update() {
        System.out.println("Notify: "+phone+" product is available now, with current stock: "+phoneObservable.getItem());
    }
}

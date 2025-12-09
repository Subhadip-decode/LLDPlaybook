import observable.ItemObservable;
import observable.PhoneObservable;
import observer.ItemObserver;
import observer.MobileNotificationObserver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ItemObservable phoneObservable = new PhoneObservable();
        ItemObserver mobileObserver1 = new MobileNotificationObserver("8145524273",phoneObservable);
        ItemObserver mobileObserver2 = new MobileNotificationObserver("7585908887",phoneObservable);

        phoneObservable.add(mobileObserver1);
        phoneObservable.add(mobileObserver2);

        phoneObservable.setItem(10);
        phoneObservable.setItem(-10);
        phoneObservable.setItem(20);
    }
}
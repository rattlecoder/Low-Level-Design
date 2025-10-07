import Observable.IphoneObservableImpl;
import Observable.StocksObservable;
import Observer.EmailAlertObserverImpl;
import Observer.MobileAlertObserverImpl;
import Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {

        StocksObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver ob1 = new EmailAlertObserverImpl("abc9@xyz.com",iphoneStockObservable);
        NotificationAlertObserver ob2 = new EmailAlertObserverImpl("abc123@xyz.com",iphoneStockObservable);
        NotificationAlertObserver ob3 = new MobileAlertObserverImpl("abc",iphoneStockObservable);

        iphoneStockObservable.add(ob1);
        iphoneStockObservable.add(ob2);
        iphoneStockObservable.add(ob3);

        iphoneStockObservable.setStockCount(9);
    }
}
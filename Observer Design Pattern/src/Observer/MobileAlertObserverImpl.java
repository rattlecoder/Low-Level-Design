package Observer;

import Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String username;
    StocksObservable stocksObservable;

    public MobileAlertObserverImpl(String emailID, StocksObservable stocksObservable){
        this.username = emailID;
        this.stocksObservable = stocksObservable;
    }

    public void update(){
        sendMessage(username, "product is in stock hurry up!!!");
    }

    private void sendMessage(String username, String msg){
        System.out.println("message sent to: " + username);
    }
}

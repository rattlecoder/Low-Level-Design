package Observer;

import Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String emailID;
    StocksObservable stocksObservable;

    public EmailAlertObserverImpl(String emailID, StocksObservable stocksObservable){
        this.emailID = emailID;
        this.stocksObservable = stocksObservable;
    }

    public void update(){
        sendMail(emailID, "product is in stock hurry up!!!");
    }

    private void sendMail(String emailID, String msg){
        System.out.println("mail sent to: " + emailID);
    }

}

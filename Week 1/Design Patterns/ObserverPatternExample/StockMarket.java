package ObserverPatternExample;
import java.util.*;
public class StockMarket implements Stock {
    List<Observer> observers;
    String userName;
    String mailId;
    double price;

    public StockMarket(String userName, String mailId, double price) {
        observers = new ArrayList<>();
        this.userName = userName;
        this.mailId=mailId;
        this.price = price;
    }
    
    public void setPrice(double price) {
        this.price = price;
        notifyObserver();
    }

    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void deregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer ob:observers) {
            ob.update(price);
        }
    }
}


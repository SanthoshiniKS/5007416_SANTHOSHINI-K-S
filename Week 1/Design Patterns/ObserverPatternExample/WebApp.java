package ObserverPatternExample;
class WebApp implements Observer{
    StockMarket stockMarket;

    public WebApp(StockMarket stockMarket) {
        this.stockMarket = stockMarket;
    }
    public void update(double price){
        System.out.println("[Web App] Stock Market Price was updated to "+price);
    }
}
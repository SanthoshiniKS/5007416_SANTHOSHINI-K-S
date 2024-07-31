/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverPatternExample;
class MobileApp implements Observer{
    StockMarket stockMarket;

    public MobileApp(StockMarket stockMarket) {
        this.stockMarket = stockMarket;
    }
    public void update(double price){
        System.out.println("[Mobile App] Stock Market Price was updated to "+price);
    }
}


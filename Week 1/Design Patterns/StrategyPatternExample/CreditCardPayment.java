package StrategyPatternExample;
public class CreditCardPayment implements PaymentStrategy {
    String cardHolderName;
    String cardNumber;
    String validity;

    public CreditCardPayment(String cname, String cno, String validity) {
        this.cardHolderName = cname;
        this.cardNumber = cno;
        this.validity=validity;
    }

    @Override
    public void pay(int amount) {
        System.out.println("The amount " + amount + " was paid successfully by " + cardHolderName + " using Credit Card.");
    }
}

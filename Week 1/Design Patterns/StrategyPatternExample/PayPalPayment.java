package StrategyPatternExample;
public class PayPalPayment implements PaymentStrategy {
    String userName;
    String mailId;
    String phoneNo;
    String upiId;

    public PayPalPayment(String uname, String mailId, String upiId, String phoneNo) {
        this.userName = uname;
        this.mailId = mailId;
        this.upiId = upiId;
        this.phoneNo = phoneNo;
    }

    @Override
    public void pay(int amount) {
        System.out.println("The amount " + amount + " was paid successfully by " + userName + " using PayPal.");
    }
}


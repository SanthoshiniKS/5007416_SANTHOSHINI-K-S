package StrategyPatternExample;
public class StrategyPatternExample {
    public static void main(String[] args) {
        PaymentStrategy c=new CreditCardPayment( "aaa", "1000 2344 0000 1111","31/12/2024");
        PaymentStrategy p=new PayPalPayment("abc","abc@gmail.com","1234","90000 13244");

        PaymentContext context=new PaymentContext(c);
        context.execute(100);

        context = new PaymentContext(p);
        context.execute(200);
    }
}
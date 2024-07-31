package AdapterPatternExample;
public class AdapterPatternExample {
    public static void main(String[] args) {
        Gateway3 g3=new Gateway3();
        PaymentProcessor p=new PaymentAdapter(g3);
        String res=p.processPayment(100.00);
        System.out.println(res);
    }
}

package AdapterPatternExample;
class PaymentAdapter implements PaymentProcessor{
    private Gateway3 g3;
    public PaymentAdapter(Gateway3 g3){
        this.g3=g3;
    }
    @Override
    public String processPayment(double amount){
        return g3.makePayment(amount);
    }
}

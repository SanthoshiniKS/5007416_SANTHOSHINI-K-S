package DecoratorPatternExample;
class SMSNotifierDecorator extends NotifierDecorator{
    public SMSNotifierDecorator(Notifier n){
        super(n);
    }
    @Override
    public String send(String msg){
        return super.send(msg)+" + SMS Message: "+msg;
    }
}


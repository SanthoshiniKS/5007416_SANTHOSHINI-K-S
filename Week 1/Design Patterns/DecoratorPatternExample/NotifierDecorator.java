package DecoratorPatternExample;
public class NotifierDecorator implements Notifier{
    Notifier n;
    public NotifierDecorator(Notifier n){
        this.n=n;
    }
    @Override
    public String send(String msg){
        return n.send(msg);
    }
}

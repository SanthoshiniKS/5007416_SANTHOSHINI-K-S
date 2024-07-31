package DecoratorPatternExample;
public class EmailNotifier implements Notifier{
    @Override
    public String send(String msg){
       return "Email Message: "+msg;
    }
}

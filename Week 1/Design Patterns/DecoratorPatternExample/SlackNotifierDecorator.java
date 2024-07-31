package DecoratorPatternExample;
class SlackNotifierDecorator extends NotifierDecorator{
    public SlackNotifierDecorator(Notifier n){
        super(n);
    }
    @Override
    public String send(String msg){
        return super.send(msg)+" + Slack Message: "+msg;
    }
}
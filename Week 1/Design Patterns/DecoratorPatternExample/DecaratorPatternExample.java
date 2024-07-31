
package DecoratorPatternExample;
public class DecaratorPatternExample {
    public static void main(String[] args) {
        Notifier mail=new EmailNotifier();
        Notifier sms=new SMSNotifierDecorator(mail);
        Notifier slack=new SlackNotifierDecorator(sms);
        System.out.println(mail.send("Hello"));
        System.out.println(sms.send("World"));
        System.out.println(slack.send("Java"));
    }
}

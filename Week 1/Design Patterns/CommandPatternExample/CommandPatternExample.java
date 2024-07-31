package CommandPatternExample;
public class CommandPatternExample {
    public static void main(String[] args) {
        Light l=new Light();
        Command lon=new LightOnCommand(l);
        Command loff=new LightOffCommand(l);
        RemoteControl rc=new RemoteControl();
        rc.setCommand(lon);
        rc.performAction();

        rc.setCommand(loff);
        rc.performAction();
    }
}





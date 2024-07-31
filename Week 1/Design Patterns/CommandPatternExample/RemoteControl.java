package CommandPatternExample;
public class RemoteControl {
    Command c;
    //method to execute the command

    public void setCommand(Command c) {
        this.c=c;
    }

    public void performAction() {
        c.execute();
    }
}

package CommandPatternExample;
public class LightOffCommand implements Command{
    Light l;
    
    LightOffCommand(Light l){
        this.l=l;
    }
    public void execute(){
       l.turnOff();
    }
}
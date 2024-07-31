package SingletonPatternExample;
public class Logger {
    private static Logger log;
    private Logger(){
        //Private Constructor
        System.out.println("Instance of Logger Class created");
    }
    public static Logger getInstance(){
        if(log==null){
            log=new Logger();
        }
        return log;
    }
}

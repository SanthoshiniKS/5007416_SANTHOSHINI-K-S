package factorymethodpatternexample;
public class WordFile implements WordDocument{
    @Override
    public void getFile(){
        System.out.println("Getting Word File...");
    }
}

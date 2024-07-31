package factorymethodpatternexample;
public class ExcelFile implements ExcelDocument{
    
    @Override
    public void getFile(){
        System.out.println("Getting Excel File...");
    }
}

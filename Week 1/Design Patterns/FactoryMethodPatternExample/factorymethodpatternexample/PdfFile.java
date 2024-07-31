package factorymethodpatternexample;
public class PdfFile implements PdfDocument{
    @Override
    public void getFile(){
        System.out.println("Getting PDF File...");
    }
}

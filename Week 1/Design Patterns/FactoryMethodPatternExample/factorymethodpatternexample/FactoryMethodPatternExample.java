package factorymethodpatternexample;
public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        DocumentFactory wordFactory=new WordDocumentFactory();
        Document word=wordFactory.createDocument();
        word.getFile();
       
        DocumentFactory pdfFactory=new PdfDocumentFactory();
        Document pdf=pdfFactory.createDocument();
        pdf.getFile();

        DocumentFactory excelFactory=new ExcelDocumentFactory();
        Document excel=excelFactory.createDocument();
        excel.getFile();
    }
}

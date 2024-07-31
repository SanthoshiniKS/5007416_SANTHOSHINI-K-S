package ProxyPatternExample;
public class ProxyPatternExample {
    public static void main(String[] args) {
        Image image1=new ProxyImage("Image1.jpg");
	image1.display();
		
	image1.display();//Image will not be loaded again, it is cached and displayed.
		
	Image image2=new ProxyImage("Image2.jpg");
	image2.display();
		
	Image image3=new ProxyImage("Image3.pdf");
	image3.display();//Image cannot be displayed since image format is not supported
    }
}

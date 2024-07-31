package ProxyPatternExample;
public class ProxyImage implements Image{
    RealImage r;
    String imageName;
    
    public ProxyImage(String imageName){
        this.imageName=imageName;
    }
    
    @Override
    public void display(){
        if(!isFormatAllowed()){
            System.out.println("Image Format should be jpg or png");
            return;
        }
        if(r==null){
            r=new RealImage(imageName);
        }
        r.display();
    }
    
    boolean isFormatAllowed() {
        return imageName.endsWith(".jpg") || imageName.endsWith(".png");
    }
}

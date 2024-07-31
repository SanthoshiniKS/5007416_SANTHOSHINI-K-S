package ProxyPatternExample;
public class RealImage implements Image{
    String imageName;
    
    public RealImage(String imageName){
        this.imageName=imageName;
        loadImage();
    }
    
    public void loadImage(){
        System.out.println("Loading Image: "+imageName);
    }
    
    @Override
    public void display(){
        System.out.println("Displaying Name: "+imageName);
    }
}

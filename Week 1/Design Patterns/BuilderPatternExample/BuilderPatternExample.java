package BuilderPatternExample;
public class BuilderPatternExample {
    public static void main(String[] args) {
        Computer PC1=new Computer.Builder().setCPU("Intel i9").setRAM("32GB").setStorage("1TB SSD").setScreenSize("14 inch").build();
        Computer PC2=new Computer.Builder().setCPU("Intel i5").setRAM("16GB").build();
        System.out.println("PC 1 Configuration: " +PC1);
        System.out.println("PC 2 Configuration: " +PC2);
    }
}

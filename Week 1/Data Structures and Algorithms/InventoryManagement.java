import java.util.*;
public class InventoryManagement {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Inventory inventory=new Inventory();
        while(true){
            System.out.println("1.Add Product\n2.Update Product\n3.Remove Product\n4.Search Product\n5.Display all Products\n6.Exit");
            int ch=obj.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter Product id: ");
                    int id=obj.nextInt();
                    System.out.println("Enter Product Name: ");
                    String n=obj.next();
                    System.out.println("Enter Product Quantity: ");
                    int q=obj.nextInt();
                    System.out.println("Enter Product price: ");
                    double p=obj.nextDouble();
                    inventory.addProduct(id, n, q, p);
                    break;
                case 2:
                    System.out.println("1.Update Quantity\n2.Update Price");
                    int c=obj.nextInt();
                    System.out.println("Enter Product Id: ");
                    int i=obj.nextInt();
                    if(c==1){
                        System.out.println("Enter Quantity to update: ");
                        int qu=obj.nextInt();
                        inventory.updateQuantity(i, qu);
                    }
                    if(c==2){
                        System.out.println("Enter Price to update: ");
                        int pri=obj.nextInt();
                        inventory.updatePrice(i, pri);
                    }
                    break;
                case 3:
                    System.out.println("Enter Product Id to Remove: ");
                    id=obj.nextInt();
                    inventory.removeProduct(id);
                    break;
                case 4:
                    System.out.println("Enter Product Id to Search: ");
                    id=obj.nextInt();
                    inventory.searchProduct(id);
                    break;
                case 5:
                    System.out.println("------Product List------");
                    inventory.displayAllProducts();
                    break;
                case 6:
                    return;
            }
        }
    }
}

class Product{
    int productId;
    String productName;
    int quantity;
    double price;
    Product(int id,String n,int q,double p){
        productId=id;
        productName=n;
        quantity=q;
        price=p;
    }
    public int getProductId(){
        return productId;
    }
    public String getProductName(){
        return productName;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }
    public void setQuantity(int q){
        quantity=q;
    }
    public void setPrice(double p){
        price=p;
    }
    @Override
    public String toString() {
        return "Product ID: "+productId+"\nName: "+productName+"\nQuantity: "+quantity+"\nPrice: "+price;
    }
}

class Inventory{
    HashMap<Integer,Product> productMap;
    ArrayList<Product> products;
    Inventory(){
        productMap=new HashMap();
        products=new ArrayList<>();
    }
    public void addProduct(int id,String n,int q,double p){
        Product product=new Product(id,n,q,p);
        productMap.put(id,product);
        products.add(product);
    }
    public void updateQuantity(int id,int q){
        Product product=productMap.get(id);
        if(product!=null){
            product.setQuantity(q);
        }
        else{
            System.out.println("Product Not Found");
        }
    }
    public void updatePrice(int id,double p){
        Product product=productMap.get(id);
        if(product!=null){
            product.setPrice(p);
        }
    }
    public void removeProduct(int id){
        Product product=productMap.get(id);
        if(product!=null){
            productMap.remove(product);
            products.remove(product);
        }
        else{
            System.out.println("Product Not Found");
        }
    }
    public void searchProduct(int id){
        Product product=productMap.get(id);
        if(product!=null){
            System.out.println(product);
        }
        else{
            System.out.println("Product Not Found");
        }
    }
    public void displayAllProducts(){
        if(products.isEmpty()){
            System.out.println("No Products Found");
            return;
        }
        for(Product product : products) {
            System.out.println(product);
            System.out.println("-----------------------");
        }
    }
}

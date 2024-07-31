import java.util.*;
public class ECommerce {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Product products[]={new Product(1,"Pen","Stationery"),
                             new Product(2,"Pencil","Stationery"),
                             new Product(30,"Laptop","Electronics")
        };
        System.out.println("Enter Product Name to Search: ");
        String n=obj.nextLine();
        System.out.println("\nResult by Linear Search: ");
        linearSearch(products,n);
        System.out.println("-------------------------------");
        System.out.println("\nResult by Binary Search: ");
        binarySearch(products,n);
    }
    public static void linearSearch(Product products[],String n){
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(n)) {
                 System.out.println(product);
                 return;
            }
        }
        System.out.println("Product Not Found");
    }
    
    public static int partition(Product[] arr, int low, int high) {
        Product pivot=arr[high];
        int i=(low-1);
        for (int j=low;j<high;j++) {
            if (arr[j].getProductName().compareToIgnoreCase(pivot.getProductName()) <= 0) {
                i++;
                Product temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Product temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    
    public static void quickSort(Product[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void binarySearch(Product products[],String n){
        quickSort(products,0,products.length-1);
        int l=0,r=products.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if((products[mid].getProductName().compareTo(n))<0){
                l=mid+1;
            }
            else if(products[mid].getProductName().equals(n)){
                System.out.println(products[mid]);
                return;
            }
            else{
                r=mid-1;
            }
        }
        System.out.println("Product Not Found");
    }
}

class Product{
    int productId;
    String productName;
    String category;
    Product(int id,String n,String c){
        productId=id;
        productName=n;
        category=c;
    }
    public String getProductName(){
        return productName;
    }
    @Override
    public String toString() {
        return "Product ID: "+productId+"\nName: "+productName+"\nCategory: "+category;
    }
}

public class CustomerOrder {
    public static void main(String[] args) {
        Order orders[]={
            new Order(1,"Pen",100),
            new Order(5,"Laptop",50000),
            new Order(10,"Pencil",10)
        };
        Order orderCopy[]=orders.clone();
        long startTime=System.nanoTime();
        bubbleSort(orders);
        long endTime=System.nanoTime();
        long bTime=endTime-startTime;
        System.out.println("Time taken by Bubble Sort: " +bTime+" ns");
        
        startTime=System.nanoTime();
        insertionSort(orderCopy);
        endTime=System.nanoTime();
        long iTime=endTime-startTime;
        System.out.println("Time taken by Insertion Sort: " +iTime+" ns");
        
        if(bTime<iTime){
            System.out.println("Bubble Sort has less Time Complexity ");
        }
        else{
            System.out.println("Insertion Sort has less Time Complexity");
        }
    }
    public static void bubbleSort(Order orders[]){
        int max=0,didSwap=0;
        for(int i=orders.length-1;i>=1;i--){
            for(int j=0;j<i;j++){
                if(orders[j].getTotalPrice()>orders[j+1].getTotalPrice()){
                    Order temp=orders[j];
                    orders[j]=orders[j+1];
                    orders[j+1]=temp;
                    didSwap=1;
                }
            }
            if(didSwap==0)
                break;
        }
    }
    public static void insertionSort(Order orders[]){
        int j=0;
        for(int i=0;i<orders.length;i++){
            j=i;
            while(j>0 && orders[j].getTotalPrice()<orders[j-1].getTotalPrice()){
                Order temp=orders[j-1];
                orders[j-1]=orders[j];
                orders[j]=temp;
                j--;
            }
        }
    }
}

class Order{
    int orderId;
    String orderName;
    double totalPrice;
    Order(int id,String n,double p){
        orderId=id;
        orderName=n;
        totalPrice=p;
    }
    public int getOrderId(){
        return orderId;
    }
    public String getOrderName(){
        return orderName;
    }
    public double getTotalPrice(){
        return totalPrice;
    }
}
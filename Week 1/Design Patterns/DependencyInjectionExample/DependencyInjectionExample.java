package DependencyInjectionExample;
import java.util.*;
public class DependencyInjectionExample {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Customer[] customers = {
            new Customer(1, "aaa"),
            new Customer(2, "bbb"),
            new Customer(3, "ccc"),
            new Customer(4, "ddd")
        };
        CustomerRepository cRepo=new CustomerRepositoryImpl(customers);
        CustomerService cs=new CustomerService(cRepo);
        System.out.println("Enter Customer Id to find: ");
        int customerId=obj.nextInt();
        Customer customerDetails=cs.getCustomerDetails(customerId);
        System.out.println((customerDetails!=null)?customerDetails:"No customer found");
    } 
}

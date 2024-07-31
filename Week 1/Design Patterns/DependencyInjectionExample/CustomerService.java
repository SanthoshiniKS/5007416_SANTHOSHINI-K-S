package DependencyInjectionExample;
public class CustomerService {
    CustomerRepository cr;

    CustomerService(CustomerRepository cr) {
        this.cr=cr;
    }

    Customer getCustomerDetails(int id) {
        Customer customer=cr.findCustomerById(id);
        return customer;
    }
}

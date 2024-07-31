package DependencyInjectionExample;
public class CustomerRepositoryImpl implements CustomerRepository {
    Customer[] customers;

    CustomerRepositoryImpl(Customer[] customers) {
        this.customers = customers;
    }

    @Override
    public Customer findCustomerById(int id) {
        for(int i=0;i<customers.length;i++) {
            if(customers[i].getId() == id) {
                return customers[i];
            }
        }
        return null;
    }
}
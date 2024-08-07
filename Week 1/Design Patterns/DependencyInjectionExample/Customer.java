package DependencyInjectionExample;
public class Customer {
    int id;
    String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public String toString(){
        return "Customer ID: " + getId() + ", Name: " + getName();
    }
}


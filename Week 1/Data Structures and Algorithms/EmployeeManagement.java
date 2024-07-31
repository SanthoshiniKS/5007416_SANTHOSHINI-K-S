import java.util.*;

public class EmployeeManagement {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);
        while (true) {
            System.out.println("Employee Management System");
            System.out.println("1. Add Employee\n2. Delete Employee\n3. Search Employee\n4. Display Employees\n5. Exit");
            System.out.print("Enter your choice: ");
            int ch = obj.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter employee ID: ");
                    int id = obj.nextInt();
                    obj.nextLine();
                    System.out.print("Enter name: ");
                    String name = obj.nextLine();
                    System.out.print("Enter position: ");
                    String position = obj.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = obj.nextDouble();
                    Employee emp = new Employee(id, name, position, salary);
                    ems.add(emp);
                    break;
                case 2:
                    System.out.print("Enter employee ID to delete: ");
                    int deleteId = obj.nextInt();
                    ems.delete(deleteId);
                    break;
                case 3:
                    System.out.print("Enter employee ID to search: ");
                    int searchId = obj.nextInt();
                    Employee found = ems.search(searchId);
                    if (found != null) {
                        System.out.println("Employee found: " + found);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 4:
                    ems.traverse();
                    break;
                case 5:
                    return;
            }
        }
    }
}

class Employee {

    int employeeId;
    String name;
    String position;
    double salary;

    Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + employeeId + "\nName: " + name + "\nPosition: " + position + "\nSalary: " + salary;
    }
}

class EmployeeManagementSystem {

    Employee[] employees;
    int size;
    int capacity;

    EmployeeManagementSystem(int capacity) {
        this.capacity = capacity;
        this.employees = new Employee[capacity];
        this.size = 0;
    }

    public void add(Employee emp) {
        if (size < capacity) {
            employees[size++] = emp;
        } else {
            System.out.println("Array is full, cannot add more employees.");
        }
    }

    public Employee search(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverse() {
        if(size==0){
            System.out.println("No records found");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println("\tEmployee "+(i+1)+"\n"+employees[i]+"\n");
        }
    }

    public void delete(int employeeId) {
        int indexToDelete = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == employeeId) {
                indexToDelete = i;
                break;
            }
        }
        if (indexToDelete != -1) {
            for (int i = indexToDelete; i < size - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[--size] = null;
            System.out.println("Deleted Successfully");
        } else {
            System.out.println("Employee not found.");
        }
    }
}

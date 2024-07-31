import java.util.*;

public class TaskManagement {

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner obj = new Scanner(System.in);
        int ch = 0;
        while (ch != 5) {
            System.out.println("Task Management System:");
            System.out.println("1. Add Task");
            System.out.println("2. Search Task");
            System.out.println("3. Delete Task");
            System.out.println("4. Traverse Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            ch = obj.nextInt();
            obj.nextLine();
            switch (ch) {
                case 1:
                    System.out.print("Enter Task ID: ");
                    String taskId = obj.nextLine();
                    System.out.print("Enter Task Name: ");
                    String taskName = obj.nextLine();
                    System.out.print("Enter Task Status: ");
                    String status = obj.nextLine();
                    manager.addTask(new Task(taskId, taskName, status));
                    break;

                case 2:
                    System.out.print("Enter Task Name to Search: ");
                    String searchName = obj.nextLine();
                    manager.searchTask(searchName);
                    break;

                case 3:
                    System.out.print("Enter Task ID to Delete: ");
                    String deleteId = obj.nextLine();
                    manager.delete(deleteId);
                    break;

                case 4:
                    System.out.println("All tasks:");
                    manager.traverse();
                    break;
            }
        }
    }
}

class Task {

    String taskId;
    String taskName;
    String status;

    public Task(String id, String name, String sts) {
        taskId = id;
        taskName = name;
        status = sts;
    }

    public String toString() {
        return "TaskID: " + taskId + "\nTaskName: " + taskName + "\nStatus: " + status;
    }
}

class Node {

    Task t;
    Node next;

    public Node(Task t) {
        this.t = t;
        this.next = null;
    }
}

class TaskManager {

    Node head;

    public TaskManager() {
        head = null;
    }

    public void addTask(Task t) {
        Node newNode = new Node(t);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void searchTask(String tn) {
        Node temp = head;
        while (temp != null) {
            if (temp.t.taskName.equals(tn)) {
                System.out.println(temp.t);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Task not found.");
    }

    public void traverse() {
        Node temp = head;
        int i = 1;
        while (temp != null) {
            System.out.println("Task " + i + " " + temp.t);
            i++;
            temp = temp.next;
        }
    }

    public void delete(String taskId) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.t.taskId.equals(taskId)) {
                temp.next = temp.next.next;
                System.out.println("The Task Was Deleted Successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Task not found");
    }
}

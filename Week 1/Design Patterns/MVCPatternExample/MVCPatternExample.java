package MVCPatternExample;
public class MVCPatternExample {
    public static void main(String[] args) {
        Student model = new Student("cs001","aaa","CSE","O");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model,view);
        
        System.out.println("Initial Student Details:");
        controller.updateView();
        System.out.println();

        controller.setStudentName("abc");
        controller.setStudentDept("IT");

        System.out.println("Updated Student Details:");
        controller.updateView();
    } 
}
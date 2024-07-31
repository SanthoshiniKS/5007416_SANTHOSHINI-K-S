package MVCPatternExample;

public class Student {

    String id;
    String name;
    String dept;
    String grade;

    public Student(String id,String name,String dept,String grade) {
        this.id = id;
        this.name = name;
        this.dept=dept;
        this.grade = grade;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

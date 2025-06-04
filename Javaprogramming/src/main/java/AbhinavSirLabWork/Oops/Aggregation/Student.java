package AbhinavSirLabWork.Oops.Aggregation;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }
}
class Department{
    String deptName;
    List<Student> students;

    public Department(String deptName, List<Student> students) {
        this.deptName = deptName;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
    public void addStudents(Student student){
        students.add(student);
    }
}
class Institute{
    String instituteName;
    List<Department> departments;

    public Institute(String instituteName, List<Department> departments) {
        this.instituteName = instituteName;
        this.departments = departments;
    }
    public void addDepartments(Department department){
        departments.add(department);
    }
    public int getTotalStudentsInInstitute(){
        int noOfStudents=0;
        List<Student> students=null;
        for (Department department:departments){
            students=department.getStudents();
            for (Student student:students){
                noOfStudents++;
            }
        }
        return noOfStudents;
    }
}
class AggregationExample{
    public static void main(String[] args) {
        // student object
       Student cse_student1=new Student("Kay",1);
        Student cse_student2=new Student("Rey",2);
        Student ece_student1=new Student("Sana",3);
        Student ece_student2=new Student("Vibhoy",4);
        List<Student> cse_List=new ArrayList<>();
        // adding it to cse_List
        cse_List.add(cse_student1);
        cse_List.add(cse_student2);
        List<Student> ece_List=new ArrayList<>();
        // adding it to ece_List
        ece_List.add(ece_student1);
        ece_List.add(ece_student2);
        // creating department object with student list
        Department CSE=new Department("CSE",cse_List);
        Department ECE=new Department("ECE",ece_List);
        List<Department> departments=new ArrayList<>();
        // adding into the department
        departments.add(CSE);
        departments.add(ECE);
        Institute institute=new Institute("Bits",departments);
        System.out.println("Total students in department "+institute.getTotalStudentsInInstitute());
    }
}


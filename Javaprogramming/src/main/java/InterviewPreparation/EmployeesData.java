package InterviewPreparation;

import java.util.List;

public class EmployeesData {
    private int id;
    private String name;
    private String department;
    private long salary;
    private String gender;
    private List<String> hoobies;

    public EmployeesData(int id, String name, String department, String gender,List<String> hoobies,long salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.gender = gender;
        this.hoobies=hoobies;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setHoobies(List<String> hoobies){
        this.hoobies=hoobies;
    }
    public List<String> getHobbies(){
        return hoobies;
    }
    public void setSalary(long salary){
        this.salary=salary;
    }
    public long getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return "EmployeesData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", hoobies=" + hoobies +
                '}';
    }
}

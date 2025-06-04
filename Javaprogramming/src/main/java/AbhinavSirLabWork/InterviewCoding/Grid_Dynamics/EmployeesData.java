package AbhinavSirLabWork.InterviewCoding.Grid_Dynamics;

import java.util.Objects;

public class EmployeesData {
    private String name;
    private String add;
    private String subject;



    public EmployeesData(String name, String add, String subject) {
        this.name = name;
        this.add = add;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "EmployeesData{" +
                "name='" + name + '\'' +
                ", add='" + add + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeesData EmployeesData = (EmployeesData) o;
        return Objects.equals(name, EmployeesData.name) && Objects.equals(add, EmployeesData.add) && Objects.equals(subject, EmployeesData.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, add, subject);
    }
}

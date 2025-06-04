package Java8_150Coding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class concatTwoList {
    public static void main(String[] args) {
        List<EmployeesData> emp1=new ArrayList<>();
        emp1.add(new EmployeesData(1,"Raghav","Science",43));
        emp1.add(new EmployeesData(3,"Sanjeev","Math",78));
        emp1.add(new EmployeesData(2,"Manan","Biology",45));
        List<EmployeesData> emp2=new ArrayList<>();
        emp2.add(new EmployeesData(5,"kamlesh","Geography",56));
        emp2.add(new EmployeesData(7,"Manohar","History",89));
        List<EmployeesData> sortByRollNo= Stream.concat(emp1.stream(),emp2.stream()).
                sorted(Comparator.comparing(EmployeesData::getRoll_No)).collect(Collectors.toList());
        System.out.println(sortByRollNo);
    }
}
class EmployeesData{
    int id;
    String name;
    String subject;
    int roll_No;

    public EmployeesData() {
    }

    public EmployeesData(int id, String name, String subject, int roll_No) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.roll_No = roll_No;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getRoll_No() {
        return roll_No;
    }

    public void setRoll_No(int roll_No) {
        this.roll_No = roll_No;
    }

    @Override
    public String toString() {
        return "EmployeesData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", roll_No=" + roll_No +
                '}';
    }
}

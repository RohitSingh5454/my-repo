package AbhinavSirLabWork.InterviewCoding.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sortTwoList {
    public static void main(String[] args) {
        List<EmployeesData> emp1=new ArrayList<>();
        emp1.add(new EmployeesData(1,"Kalpana","Science",45));
        emp1.add(new EmployeesData(4,"sachin","Economics",32));
        emp1.add(new EmployeesData(2,"gaurav","Math",67));
        List<EmployeesData> emp2=new ArrayList<>();
        emp2.add(new EmployeesData(7,"Manohar","biology",78));
        emp2.add(new EmployeesData(18,"Girdhar","History",68));
        emp2.add(new EmployeesData(14,"kamlesh","Civics",58));
        // sort by rollNo
        List<EmployeesData> sortByRollNo= Stream.concat(emp1.stream(),emp2.stream()).sorted(Comparator.comparing(EmployeesData::getRoll_No))
                .collect(Collectors.toList());
        System.out.println(sortByRollNo);
        // sort by name
        List<EmployeesData> sortByName=Stream.concat(emp1.stream(),emp2.stream()).
                sorted(Comparator.comparing(EmployeesData::getName)).collect(Collectors.toList());
        System.out.println(sortByName);
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


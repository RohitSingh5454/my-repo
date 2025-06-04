package AbhinavSirLabWork.InterviewCoding.iexceed;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sortingTwoList {
    public static void main(String[] args) {
        List<EmployeeIexceed> emp1=new ArrayList<>();
        emp1.add(new EmployeeIexceed(1,"Kalpana","Science",45));
        emp1.add(new EmployeeIexceed(4,"sachin","Economics",32));
        emp1.add(new EmployeeIexceed(2,"gaurav","Math",67));
        List<EmployeeIexceed> emp2=new ArrayList<>();
        emp2.add(new EmployeeIexceed(7,"Manohar","biology",78));
        emp2.add(new EmployeeIexceed(18,"Girdhar","History",68));
        emp2.add(new EmployeeIexceed(14,"kamlesh","Civics",58));
      Stream.concat(emp1.stream(),emp2.stream())
              .sorted(Comparator.comparing(EmployeeIexceed::getId)).collect(Collectors.toList()).forEach(System.out::println);

    }
}
class EmployeeIexceed{
    int id;
    String name;
    String subject;
    int roll_No;

    public EmployeeIexceed() {
    }

    public EmployeeIexceed(int id, String name, String subject, int roll_No) {
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

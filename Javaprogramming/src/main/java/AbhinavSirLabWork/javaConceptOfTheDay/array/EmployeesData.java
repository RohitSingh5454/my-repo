package AbhinavSirLabWork.javaConceptOfTheDay.array;
import java.util.ArrayList;
import java.util.List;
public class EmployeesData {
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;
    public EmployeesData(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }
    public static void set() {
        List<EmployeesData> EmployeesDataList = new ArrayList<>();
        EmployeesDataList.add(new EmployeesData(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        EmployeesDataList.add(new EmployeesData(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
    }
}

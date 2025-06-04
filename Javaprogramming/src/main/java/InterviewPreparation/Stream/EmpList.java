package InterviewPreparation.Stream;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class EmpList {
    public static void main(String[] args) {
       /* List<EmployeesData> l2 = getAllEmp();
        List<String> listNull = Arrays.asList("A", null, "B", "C", "D", null);
        System.out.println("***sorted strings with null last");
        List<String> ls = listNull.stream().sorted(Comparator.nullsFirst(Comparator.naturalOrder())).collect(Collectors.toList());
        System.out.println(ls);*/
        List<EmployeesData> empSorted=getEmployeesDataWithNullDate().stream().sorted(Comparator.nullsFirst(new DateOfBirth())).collect(Collectors.toList());
        System.out.println(empSorted);


    }

    public static List<EmployeesData> getAllEmp() {
        List<EmployeesData> l1 = new ArrayList<>();
        l1.add(new EmployeesData(1, "Mark", LocalDate.of(1997, 2, 19), Arrays.asList("Swimming", "Driving")));
        l1.add(new EmployeesData(2, "Scott", LocalDate.of(1995, 6, 14), Arrays.asList("Parking", "Tennis")));
        l1.add(new EmployeesData(3, "Tom", LocalDate.of(1992, 4, 11), Arrays.asList("Listening", "Travelling")));
        l1.add(new EmployeesData(4, "Michael", LocalDate.of(1999, 11, 27), Arrays.asList("cricket", "Reading")));
        return l1;
    }

    public static List<EmployeesData> getEmployeesDataWithNullObjects() {
        List<EmployeesData> empList = new ArrayList<>();
        empList.add(new EmployeesData(7, "Ranjan", LocalDate.of(1992, 9, 7), Arrays.asList("Listening", "Travelling")));
        empList.add(new EmployeesData(8, "Himanshu", LocalDate.of(1991, 7, 11), Arrays.asList("cricket", "Reading")));
        empList.add(null);
        return empList;
    }

    public static List<EmployeesData> getEmployeesDataWithNullDate() {
        List<EmployeesData> empList2 = new ArrayList<>();
        empList2.add(new EmployeesData(9, "Madhav", LocalDate.of(19982, 9, 19), Arrays.asList("Listening", "Travelling")));
        empList2.add(new EmployeesData(11, "Kanchan", LocalDate.of(1987, 7, 13), Arrays.asList("cricket", "Reading")));
        empList2.add(new EmployeesData(11, "Mahesh", null, Arrays.asList("cricket", "Reading")));
        empList2.add(new EmployeesData(11, "Kanchan", LocalDate.of(1998, 6, 14), Arrays.asList("cricket", "Reading")));

        return empList2;
    }
}

package InterviewPreparation.Stream;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmpMain {
    public static void main(String[] args) {
        Predicate<EmployeesData> youngerThan25= i-> LocalDate.now().getYear()-i.getDate().getYear()<25;
        //List<EmployeesData> lis=getAllEmp().stream().filter(youngerThan25).collect(Collectors.toList());
       // System.out.println(lis);
        Predicate<EmployeesData> lp=youngerThan25.and(i->i.getId()>2);
        boolean res=getAllEmp().stream().allMatch(lp);
        System.out.println(res);

    }
    public static List<EmployeesData> getAllEmp() {
        List<EmployeesData> l1 = new ArrayList<>();
        l1.add(new EmployeesData(1, "Mark", LocalDate.of(1997, 2, 19), Arrays.asList("Swimming", "Driving")));
        l1.add(new EmployeesData(2, "Scott", LocalDate.of(1995, 6, 14), Arrays.asList("Parking", "Tennis")));
        l1.add(new EmployeesData(3, "Tom", LocalDate.of(1992, 4, 11), Arrays.asList("Listening", "Travelling")));
        l1.add(new EmployeesData(4, "Michael", LocalDate.of(1999, 11, 27), Arrays.asList("cricket", "Reading")));
        return l1;
    }
}

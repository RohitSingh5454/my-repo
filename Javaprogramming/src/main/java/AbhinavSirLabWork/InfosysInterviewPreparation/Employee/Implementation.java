package AbhinavSirLabWork.InfosysInterviewPreparation.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Implementation {
    public static void main(String[] args) {
        List<Employee1> emp1=new ArrayList<>();
        emp1.add(new Employee1(23,"Raman",34,"male","Developer",2018,65000));
        emp1.add(new Employee1(24,"Sohan",24,"male","Tester",2020,45000));
        emp1.add(new Employee1(25,"Kamal",28,"male","Qality analyst",2019,35000));
        emp1.add(new Employee1(26,"Ragini",31,"female","Hr",2021,55000));

        // write a Java 8 code to count the number of EmployeesDatas in each department?
        Map<String,Long> count=emp1.stream().map(Employee1::getDepartment).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(count);

        // find out the average salary of male and female EmployeesDatas?

        Map<String,Double> averageSalaryMaleFemale=emp1.stream().
                collect(Collectors.groupingBy(Employee1::getGender,Collectors.averagingDouble(Employee1::getSalary)));
        System.out.println(averageSalaryMaleFemale);

        // find the senior most EmployeesData
        Optional<Employee1> seniorMost=emp1.stream().max(Comparator.comparingInt(Employee1::getAge));
        System.out.println(seniorMost);

        // most youngest EmployeesData
        Optional<Employee1> youngestOne=emp1.stream().min(Comparator.comparingInt(Employee1::getAge));
        System.out.println(youngestOne);

        //number of EmployeesDatas in each department if you have given a list of EmployeesDatas?
        Map<String,Long> noOfEmp=emp1.stream().collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.counting()));
        System.out.println(noOfEmp);

        // find the number of male EmployeesData and female EmployeesData

        Map<String,Long> EmployeesDataCountByDepartment=emp1.stream().
                collect(Collectors.groupingBy(Employee1::getGender,Collectors.counting()));
        System.out.println(EmployeesDataCountByDepartment);

    }
}

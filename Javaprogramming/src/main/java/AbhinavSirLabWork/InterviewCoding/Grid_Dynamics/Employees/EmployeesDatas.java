package AbhinavSirLabWork.InterviewCoding.Grid_Dynamics.EmployeesDatas;

import AbhinavSirLabWork.javaConceptOfTheDay.employee.EmployeesDataSet;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeesDatas{
    String firstName;
    String lastName;
    String deptName;
    double salary;

    public EmployeesDatas(String firstName, String lastName, String deptName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptName = deptName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeesDatas{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", deptName='" + deptName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public  double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class Xyz{
    public static void main(String[] args) {
        List<EmployeesDatas> list=new ArrayList<>();
        list.add(new EmployeesDatas("Raghav","Verma","Hod",54000.23));
        list.add(new EmployeesDatas("Sachin","Tiwary","Electrical",64000.23));
        list.add(new EmployeesDatas("Ramesh","Sharma","Mechanical",44000.23));
        list.add(new EmployeesDatas("Ranjan","Kumar","Civil",47000.23));
        list.add(new EmployeesDatas("Ramandeep","Singh","It",62000.23));
        Map<String,Optional<Double>> deptNameWithHighestSal=list.stream().collect(Collectors.groupingBy(EmployeesDatas::getDeptName
                        ,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(EmployeesDatas::getSalary))
                        ,emp->emp.map(EmployeesDatas::getSalary))));
        System.out.println(deptNameWithHighestSal);
    }
}

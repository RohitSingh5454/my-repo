package Java8_150Coding.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    String empName;
    int age;
    String gender;
    double salary;
    int yearOfJoining;
    String deptName;

    public Employee(String empName,int age, String gender, double salary, int yearOfJoining, String deptName) {
        this.empName=empName;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.yearOfJoining = yearOfJoining;
        this.deptName = deptName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", yearOfJoining=" + yearOfJoining +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
class Implementation{
    public static void main(String[] args) {
        List<Employee> emp=List.of(new Employee("Rohan",27,"male",35000.50,2018,"Sales")
                ,new Employee("Sanket",26,"male",45000.50,2019,"It")
                ,new Employee("Priya",29,"female",48000.50,2017,"Hr")
                ,new Employee("Anjali",31,"female",39000.50,2015,"Marketting")
                ,new Employee("Manan",28,"male",55000.50,2014,"Developer")
                ,new Employee("Kalpana",23,"female",65000.50,2018,"It")
                ,new Employee("Srikant",33,"male",85000.50,2016,"Developer")
                ,new Employee("Himani",25,"female",75000.50,2020,"Hr")
                ,new Employee("Abdul",29,"male",15000.50,2016,"Peon")
                ,new Employee("Sujata",23,"female",95000.50,2013,"Developer"));
        // total number of male and female
        Map<String,Long> countMaleFemale=emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println("count of male and female");
        System.out.println(countMaleFemale);
        // All department in organization
        List<String> allDepartment=emp.stream().map(Employee::getDeptName).collect(Collectors.toList());
        System.out.println("Name of total department");
        System.out.println(allDepartment);
        // average age of male and female employee
        Map<String,Double> avgAgeMaleFemale=emp.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
        System.out.println("Average age of male and female");
        System.out.println(avgAgeMaleFemale);
        //Details of highest paid employee
        List<Employee> highestPaid=emp.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(1).collect(Collectors.toList());
        System.out.println("Highest paid employee");
        System.out.println(highestPaid);
        // names of employee who joined after 2015
        List<String> namesEmployee=emp.stream().filter(i->i.getYearOfJoining()>2015).map(Employee::getEmpName).collect(Collectors.toList());
        System.out.println("Employee joined after 2015");
        System.out.println(namesEmployee);
        // count the number of employees in each department
        Map<String,Long> noEmpInEachDept=emp.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));
        System.out.println("No of employees in each department");
        System.out.println(noEmpInEachDept);
         Map<String,Double> avgSalaryDeptWise=emp.stream()
                 .collect(Collectors.groupingBy(Employee::getDeptName,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Average salary department wise "+avgSalaryDeptWise);
        // details of youngest male employee in developer dept
        List<Employee> youngestMaleEmployee=emp.stream().filter(i->i.deptName.equals("Developer")&&i.gender.equals("male"))
                .sorted(Comparator.comparing(Employee::getAge)).limit(1).collect(Collectors.toList());
        System.out.println("youngest male employee in developer department");
        System.out.println(youngestMaleEmployee);
        // most working experience in organization
        String mostWorking1=emp.stream()
                .filter(i->i.deptName.equals(Comparator.comparing(Employee::getYearOfJoining))).limit(1).toString();
        System.out.println(mostWorking1);
        // males amd females in hr and developer team
        Map<String,Long> malesFemale=emp.stream().filter(i->i.deptName.equals("Hr") ||i.deptName.equals("Developer"))
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println("male and female in hr and developer department");
        System.out.println(malesFemale);
        //average salary of males and female
        Map<String,Double> avgSalaryMaleFemale=emp.stream()
                .filter(i->i.gender.equals("male") ||i.gender.equals("female"))
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("average salary of males and female ");
        System.out.println(avgSalaryMaleFemale);
        // names of all employee in each department
        
    }
}

package AbhinavSirLabWork.java_8AbhinaBhaiyaGit;

import AbhinavSirLabWork.Packages.Package1.Pac2Imp.E;
import GfgPractice.Op;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeImplementation {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
        employeeList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
        employeeList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
        employeeList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
        employeeList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
        employeeList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
        employeeList.add(new Employee(11, "krk", 34, 160, "M", "Sales", "Blore", 2006));
        employeeList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
        employeeList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
        employeeList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));
        employeeList.add(new Employee(10, "srk", 35, 160, "M", "Sales", "Blore", 2005));

        // group by city
        Map<String,List<Employee>> map;
        map=employeeList.stream().collect(Collectors.groupingBy(Employee::getCity));
        System.out.println("Employee group by city "+map);

        // group employee by age
        Map<Integer,List<Employee>> map1;
        map1=employeeList.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println("Employee group by age "+map1);

        //  count of male and female employees present in the organization
        Map<String,Long> map2;
        map2=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println("Count of male and female "+map2);

        // names of all departments in the organization
        List<String> listDepartment=employeeList.stream().map(Employee::getDeptName).distinct().collect(Collectors.toList());
        System.out.println("All department names "+listDepartment);

        // employee details whose age is greater than 28
        List<Employee> ageGreaterThan28=employeeList.stream().filter(i->i.getAge()>28).collect(Collectors.toList());
        System.out.println("Employee details age greater than 28 "+ageGreaterThan28);

        // Find maximum age of employee
        Employee maxAgeEmployee=employeeList.stream().max(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println("Maximum aged employee "+maxAgeEmployee);

        OptionalInt maxAgeEmployee1=employeeList.stream().mapToInt(Employee::getAge).max();
        System.out.println(maxAgeEmployee1.getAsInt());

        //Average age of Male and Female Employees
        Map<String,Double> avgMaleAndFemale=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        System.out.println("Average age of male and female "+avgMaleAndFemale);

        // number of employees in each department
        Map<String,Long> noOfEmpInEachDept=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));
        System.out.println("no of employees in each department "+noOfEmpInEachDept);

        // oldest employee
            String oldestEmp=employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining)).toString();
        System.out.println("Oldest employee name "+oldestEmp);

        // youngest female employee
        String youngestFemaleEmp=employeeList.stream().filter(i->i.getGender().equals("F")).min(Comparator.comparingInt(Employee::getAge))
                .map(Employee::getName).get();
        System.out.println("youngest female employee "+youngestFemaleEmp);

        // employees whose age is greater than 30 and less than 30
        List<Employee> empAgeGreaterThan30AndLessThan30=employeeList.stream().filter(i->i.getAge()>30 || i.getAge()<30)
                .collect(Collectors.toList());
        System.out.println("Employees age greater than 30 and less than 30 "+empAgeGreaterThan30AndLessThan30);

        Map<Boolean,List<Employee>> empGreaterThan30=employeeList.stream().collect(Collectors.partitioningBy(i->i.getAge()>30));
        for (Map.Entry<Boolean,List<Employee>> maps:empGreaterThan30.entrySet()){
            if (Boolean.TRUE.equals(maps.getKey())){
                System.out.println("Employee greater than 30" +maps.getValue());
            }else {
                System.out.println("Employee less than 30 "+maps.getValue());
            }
        }
        // department name which has the highest number of employees
        Map.Entry<String,Long> deptNameHighestNoOfEmp=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting())).entrySet().stream()
                .max(Map.Entry.comparingByValue()).get();
        System.out.println("department name with highest no of emp "+deptNameHighestNoOfEmp);

        //if there any employees from HR Department
       Optional<Employee> hrDeptEmployee=employeeList.stream().filter(i->i.getDeptName().equals("HR")).findAny();
       hrDeptEmployee.ifPresent(i-> System.out.println("employee found "+i));

        //department names that these employees work for, where the number of employees in the department is over 3
      employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting())).entrySet().stream()
                .filter(i->i.getValue()>3).forEach(System.out::println);

      // distinct department names that employees work for
        List<String> distDeptName=employeeList.stream().map(Employee::getDeptName).distinct().toList();
        System.out.println("Distinct department names "+distDeptName);

        // employees who lives in ‘Blore’ city, sort them by their name and print the names of employees
        List<Employee> sortEmpInBloreByName=employeeList.stream().filter(i->i.getCity().equals("Blore"))
                .sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println("sort employee in blore by name "+sortEmpInBloreByName);

        //Number of employees in the organization
        Long noOfEmpInOrganization=employeeList.stream().count();
        System.out.println(noOfEmpInOrganization);

        // employee count in every department
        Map<String,Long> empCountInEveryDept=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));
        System.out.println("Employee count in every dept "+empCountInEveryDept);

        // the department which has the highest number of employees
        employeeList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).ifPresent(System.out::println);

        // Sorting a Stream by age and name fields
        employeeList.stream().sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getName))
                .forEach(System.out::println);

        // Highest experienced employees in the organization
        Optional<Employee> highestExpEmp=employeeList.stream()
                .min(Comparator.comparing(Employee::getYearOfJoining));
        System.out.println("Hoghest experienced employee "+highestExpEmp.get());

        // average and total salary of the organization
        Double avgSalary=employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("Average salary" +avgSalary);
        Double totalSalary=employeeList.stream().collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println("Total salary "+totalSalary);

        //Average salary of each department
        Map<String,Double> avgSalaryDeptWise=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Average salary department wise "+avgSalaryDeptWise);

        // Highest salary in the organisation
        Long highestSalary=employeeList.stream().max(Comparator.comparing(Employee::getSalary)).get().getSalary();
        System.out.println("Highest salary "+highestSalary);

        //Second Highest salary in the organisation
        Long secondHighestSalary=employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).distinct()
                .skip(1).findFirst().get().getSalary();
        System.out.println("Second highest salary "+secondHighestSalary);

        //Nth Highest salary


//      //highest paid salary in the organization based on gender
        Map<String,Optional<Employee>> highPaidSalaryBasedOnGender=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.maxBy((i1,i2)->(int) (i1.getSalary()-i2.getSalary()))));
        System.out.println("Highest salary in organization genderWise "+highPaidSalaryBasedOnGender);

        //
    }
}

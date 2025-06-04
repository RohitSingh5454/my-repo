package AbhinavSirLabWork.AbhinavSirGitPractice;

import java.util.*;
import java.util.stream.Collectors;

public class Implementation {
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
        employeeList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
        employeeList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
        employeeList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
        employeeList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
        employeeList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
        employeeList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
        employeeList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
        employeeList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));

        // employee by city
        employeeList.stream().map(i->i.getCity()).collect(Collectors.toList()).forEach(System.out::println);
        Map<String,List<Employee>> mapByCity=employeeList.stream().collect(Collectors.groupingBy(Employee::getCity));
        System.out.println("employee by city "+mapByCity);


        // employee by age
        Map<Integer,List<Employee>> mapByAge=employeeList.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println("employee by age "+mapByAge);

        //count of male and female employee
        Map<String,Long> countMaleAndFemale=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println("count of male and female "+countMaleAndFemale);

        //print names of all departments
        List<String> namesDepartment=employeeList.stream().map(i->i.getDeptName()).distinct().collect(Collectors.toList());
        System.out.println("names of all department "+namesDepartment);


        //employeedetails age greater than 28
        List<Employee> employeeGreaterThan28=employeeList.stream().filter(i->i.getAge()>28).collect(Collectors.toList());
        System.out.println("Employee greater than 28 " +employeeGreaterThan28);

       // maximum age of employee
        List<Employee> maxAge=employeeList.stream().max(Comparator.comparing(Employee::getAge)).stream().collect(Collectors.toList());;
        System.out.println("maximum age employee details "+maxAge);
        OptionalInt max=employeeList.stream().mapToInt(Employee::getAge).max();
        if (max.isPresent()){
            System.out.println("maximum employee age "+max.getAsInt());
        }

        // average age of male and female
        Map<String,Double> avgAgeMaleFemale=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
        System.out.println("average age of male and female "+avgAgeMaleFemale);

       // number of employee in each department
        Map<String,Long> noOfEmployeesEachDept=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));
        for (Map.Entry<String,Long> countEmployeeByDept:noOfEmployeesEachDept.entrySet()){
            System.out.println("no of employees in each dept " +countEmployeeByDept.getKey()+" "+countEmployeeByDept.getValue());
        }
        System.out.println("number of employees in each department "+noOfEmployeesEachDept);


        //youngest female employee
        Employee youngestEmployee=employeeList.stream().filter(i->i.getGender().equals("F"))
                .min(Comparator.comparing(Employee::getAge)).get();
        System.out.println("youngest female employee "+youngestEmployee);

        //Employees whose age is greater than 30 and less than 30
        Map<Boolean,List<Employee>> empWhoseAgeGreaterThan30AndLessThan30=employeeList.stream()
                .collect(Collectors.partitioningBy(e->e.getAge()>=30));
        for(Map.Entry<Boolean,List<Employee>> empEntry:empWhoseAgeGreaterThan30AndLessThan30.entrySet()){
            if(Boolean.TRUE.equals(empEntry.getKey())){
                System.out.println("Employee age greater than 30 "+empEntry.getValue());
            }
	        else{
                System.out.println("Employee age less than 30 "+empEntry.getValue());
            }
        }

        // find if there any employees from hr department
        Optional<Employee> employeeHrDept=employeeList.stream().filter(i->i.getDeptName().equals("HR")).findAny();
        System.out.println("Employee with hr department "+employeeHrDept);

        // Find the department names that these employees work for, where the number of employees in the department is over 3.

        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()>3).forEach(System.out::println);
//        for(Map.Entry<String,Long> entry:deptNameWithNoOfEmpGreaterThan3.entrySet()){
//            if(entry.getValue()>3){
//                System.out.println("dept name where number of employees greater than 3 "+entry.getKey()+" "+entry.getValue());
//            }
//        }

        //Find distinct department names that employees work for.
        List<String> distinctDept=employeeList.stream().map(Employee::getDeptName).distinct().collect(Collectors.toList());
        System.out.println(distinctDept);

        //Find all employees who lives in ‘Blore’ city, sort them by their name and print the names of employees.
        employeeList.stream().filter(i->i.getCity().equalsIgnoreCase("Blore")).sorted(Comparator.comparing(Employee::getName))
                .forEach(k->System.out.println("Employees working in bangalore "+k.getName()));

        // number of employess working
        Long noOfEmployees=employeeList.stream().count();
        System.out.println("no of employees working "+noOfEmployees);

        // Find employee count in every department
        Map<String,Long> empCountDeptWise=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));
        System.out.println("Employee count by department "+empCountDeptWise);

        //Find the department which has the highest number of employees.
        Map.Entry<String,Long> deptWithHighestEmp=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting())).entrySet().stream()
                .max(Comparator.comparing(i->i.getValue())).get();
            System.out.println("Department with highest employee "+deptWithHighestEmp);

            // sorting a stream by age and name
        Comparator<Employee> compByAge=Comparator.comparing(Employee::getAge);
        Comparator<Employee> compByName=Comparator.comparing(Employee::getName);
        employeeList.stream().sorted(compByAge.thenComparing(compByName)).forEach(i->System.out.println(i));

        //Highest experienced employees in the organization.
        String mostExperiencedEmployee=employeeList.stream().min(Comparator.comparing(Employee::getYearOfJoining)).get().toString();
        System.out.println("Highest experienced employees in the organization "+mostExperiencedEmployee);

        //Print average and total salary of the organization.
//        Double avgSalary=employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
//        System.out.println("Average salary "+avgSalary);
//        Double totalSalary=employeeList.stream().collect(Collectors.summingDouble(Employee::getSalary));
//        System.out.println("Total salary "+totalSalary);

        DoubleSummaryStatistics salary=employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average salary "+salary.getAverage());
        System.out.println("Total salary "+salary.getSum());

        //Print Average salary of each department
        Map<String,Double> avgSalaryDeptWise=employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Average salary each department "+avgSalaryDeptWise);

        //Find Highest salary in the organisation
        Long highestSalary=employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().get().getSalary();
        System.out.println("Highest salary "+highestSalary);
    }
}

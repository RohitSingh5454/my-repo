package AbhinavSirLabWork.javaConceptOfTheDay.employee;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class mainImplementation {
    public static void main(String[] args) {

        List<EmployeesDataSet> employeesDataSets = new ArrayList<>();

        employeesDataSets.add(new EmployeesDataSet(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeesDataSets.add(new EmployeesDataSet(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeesDataSets.add(new EmployeesDataSet(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeesDataSets.add(new EmployeesDataSet(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeesDataSets.add(new EmployeesDataSet(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeesDataSets.add(new EmployeesDataSet(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeesDataSets.add(new EmployeesDataSet(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeesDataSets.add(new EmployeesDataSet(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeesDataSets.add(new EmployeesDataSet(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeesDataSets.add(new EmployeesDataSet(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeesDataSets.add(new EmployeesDataSet(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeesDataSets.add(new EmployeesDataSet(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeesDataSets.add(new EmployeesDataSet(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeesDataSets.add(new EmployeesDataSet(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeesDataSets.add(new EmployeesDataSet(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeesDataSets.add(new EmployeesDataSet(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeesDataSets.add(new EmployeesDataSet(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
        // number of males and females employee
        Map<String,Long> malesAndFemalesCount=employeesDataSets.stream()
                .collect(Collectors.groupingBy(EmployeesDataSet::getGender,Collectors.counting()));
        System.out.println(malesAndFemalesCount);
        // all department in the organisation
         List<String> allDepartment=employeesDataSets.stream().map(EmployeesDataSet::getDepartment).distinct().collect(Collectors.toList());
        System.out.println(allDepartment);
//        // average age of male and female
           Map<String,Double> avgAgeMaleFemale=employeesDataSets.stream().
                   collect(Collectors.groupingBy(EmployeesDataSet::getGender,Collectors.averagingDouble(EmployeesDataSet::getAge)));
        System.out.println(avgAgeMaleFemale);
//        // highest paid employee
        EmployeesDataSet highestPaidEmployee=employeesDataSets.stream().
                max(Comparator.comparingDouble(EmployeesDataSet::getSalary)).get();
        System.out.println("Highest paid employee");
        System.out.println(highestPaidEmployee);
//
//        // get the names of all employees who have joined after 2025
         List<String> namesEmployeeJoinedAfter2015=employeesDataSets.stream()
                 .filter(i->i.getYearOfJoining()>2015) .map(EmployeesDataSet::getName).collect(Collectors.toList());
        System.out.println("namesEmployeeJoinedAfter2015");
        System.out.println(namesEmployeeJoinedAfter2015);
//        // count the number of employees in each department
           Map<String,Long> countEmployeesEachDepartment=employeesDataSets.stream()
                   .collect(Collectors.groupingBy(EmployeesDataSet::getDepartment,Collectors.counting()));
        System.out.println("countEmployeesEachDepartment");
        System.out.println(countEmployeesEachDepartment);
//        // average salary of each department
//        Map<String,Double> avgSalaryDept=employeesDataSets.stream().
//                collect(Collectors.groupingBy(EmployeesDataSet::getDepartment,Collectors.averagingDouble(EmployeesDataSet::getSalary)));
//        System.out.println("average salary of each department");
//        System.out.println(avgSalaryDept);
//        // details of youngest male employee in product developement
//        EmployeesDataSet youngestMaleEmployee=employeesDataSets.stream().filter(i->i.getDepartment().equals("Product Development")).
//                max(Comparator.comparing(EmployeesDataSet::getYearOfJoining)).get();
//        System.out.println("youngest male employee in product developement");
//        System.out.println(youngestMaleEmployee);
//        // details of most working experience in the organisation
//        EmployeesDataSet mostWorkingExperience=employeesDataSets.stream().
//                min(Comparator.comparing(EmployeesDataSet::getYearOfJoining)).get();
//        System.out.println("mostWorkingExperience");
//        System.out.println(mostWorkingExperience);
//        // male and female employees in sales and marketing
        Map<String,Long> maleFemaleEmployee=employeesDataSets.stream().
                filter(i->i.getDepartment().equals("Sales And Marketing")).collect(Collectors.groupingBy(EmployeesDataSet::getGender,Collectors.counting()));
        System.out.println(maleFemaleEmployee);
//        // oldest employee in organisation find  age and in which department
//       EmployeesDataSet oldestEmployeeWithDepartment =employeesDataSets.stream()
//               .max(Comparator.comparing(EmployeesDataSet::getAge)).get();
//        System.out.println("oldest employee "+oldestEmployeeWithDepartment.getName());
//        System.out.println("oldest employee age "+oldestEmployeeWithDepartment.getAge());
//        System.out.println("oldest employee department "+oldestEmployeeWithDepartment.getDepartment());
    }
}
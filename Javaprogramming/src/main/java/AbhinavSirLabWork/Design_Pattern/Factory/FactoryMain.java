package AbhinavSirLabWork.Design_Pattern.Factory;


public class FactoryMain {
    public static void main(String[] args) {
       EmployeesData EmployeesData= FactoryImplementation.getEmployeesData("AndroidDeveloper");
        System.out.println(EmployeesData);
        int salary=EmployeesData.salary();
        System.out.println("Salary is "+salary);
    }
}

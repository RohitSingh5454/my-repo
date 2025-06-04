package AbhinavSirLabWork.Design_Pattern.Factory;

public class FactoryImplementation {

    public static EmployeesData getEmployeesData(String empType){
        if (empType.trim().equalsIgnoreCase("AndroidDeveloper")){
            return new AndroidDeveloper();
        } else if (empType.trim().equalsIgnoreCase("Web_Developer")) {
            return new Web_Developer();
        }
        else {
            return null;
        }
    }
}

package AbhinavSirLabWork.InterviewCoding.Grid_Dynamics;

import java.util.HashSet;

public class mainImplementation {
    public static void main(String[] args) {
        HashSet<EmployeesData> hs=new HashSet<>();
        hs.add(new EmployeesData("a","b","c"));
        hs.add(new EmployeesData("x","y","z"));
        hs.add(new EmployeesData("a","b","c"));
        System.out.println(hs);
    }
}

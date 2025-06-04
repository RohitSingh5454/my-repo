package InterviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EmployeesDataTest2 {
    public static void main(String[] args) {
        List<EmployeesData> list2=getAllEmp();
        Predicate<EmployeesData> condition=EmployeesData -> EmployeesData.getName().startsWith("S");
        list2.removeIf(condition);
        System.out.println(list2);





    }
    public static List<EmployeesData> getAllEmp(){
        List<EmployeesData> EmployeesDataList=new ArrayList<>();
        EmployeesDataList.add(new EmployeesData(1,"Nisha","Hod","Female", Arrays.asList("running","novel"),50000));
        EmployeesDataList.add(new EmployeesData(2,"Karan","Hod","male",Arrays.asList("swimming","talking"),80000));
        EmployeesDataList.add(new EmployeesData(3,"Sarita","Developer","Female",Arrays.asList("reading","netflix"),45000));
        EmployeesDataList.add(new EmployeesData(4,"Vishal","Developer","male",Arrays.asList("listening song","hotstar"),67000));
        EmployeesDataList.add(new EmployeesData(5,"Sachin","Hod","male",Arrays.asList("cricket","football"),88000));
        return EmployeesDataList;

    }
}

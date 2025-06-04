package InterviewPreparation;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class EmployTest {
    public static void main(String[] args) {
        List<EmployeesData> EmployeesDatas=getAllEmp();
         List<EmployeesData> EmployeesDataList=getAllEmp();
         List<EmployeesData> list1=EmployeesDataList.stream().filter(i->i.getDepartment().startsWith("D")).collect(Collectors.toList());
        //System.out.println(list1);
        List<Boolean> list2=EmployeesDataList.stream().map(i->i.getDepartment().equals("Hod")).collect(Collectors.toList());
        //System.out.println(list2);
        List<EmployeesData> list3=EmployeesDataList.stream().filter(i->i.getSalary()>67000).collect(Collectors.toList());
       // System.out.println(list3);
        List<EmployeesData> list4=EmployeesDataList.stream().filter(i->i.getGender().equals("male")).collect(Collectors.toList());
        //System.out.println(list4);
        List<Boolean> list5=EmployeesDataList.stream().map(i->i.getGender().equals("male")&&i.getDepartment().equals("Hod")).collect(Collectors.toList());
        //System.out.println(list5);
        List<EmployeesData> list6=EmployeesDataList.stream().map(i->{
            i.setSalary(i.getSalary()+10000);
            return i;
        }).collect(Collectors.toList());
       // System.out.println(list6);
        Comparator<EmployeesData> c1=Comparator.comparing(EmployeesData::getSalary);
        EmployeesData minObj=EmployeesDatas.stream().min(c1).get();
        System.out.println(minObj);
        EmployeesData maxObj=EmployeesDatas.stream().max(c1).get();
        System.out.println(maxObj);
    }
    public static List<EmployeesData> getAllEmp(){
        List<EmployeesData> EmployeesDataList=new ArrayList<>();
        EmployeesDataList.add(new EmployeesData(1,"Nisha","Hod","Female", Arrays.asList("running","novel"),50000));
        EmployeesDataList.add(new EmployeesData(2,"Karan","Hod","male",Arrays.asList("swimming","talking"),80000));
        EmployeesDataList.add(new EmployeesData(3,"Sarita","Developer","Female",Arrays.asList("reading","netflix"),45000));
        EmployeesDataList.add(new EmployeesData(4,"Vishal","Developer","male",Arrays.asList("listening song","hotstar"),67000));
        EmployeesDataList.add(new EmployeesData(5,"Rishab","Hod","male",Arrays.asList("cricket","football"),88000));
        return EmployeesDataList;

    }
}

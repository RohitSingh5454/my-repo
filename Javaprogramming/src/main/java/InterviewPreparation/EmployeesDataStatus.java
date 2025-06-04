package InterviewPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum EmployeesDataStatus {
    Active,Inactive
}
class EmployeesData34{
    private  String name;
    private EmployeesDataStatus status;
    EmployeesData34(String name,EmployeesDataStatus status){
        this.name=name;
        this.status=status;
    }

    public String getName() {
        return name;
    }

    public EmployeesDataStatus getStatus() {
        return status;
    }
}
class Main{
    public static void main(String[] args) {
        List<EmployeesData34> list= Arrays.asList(new EmployeesData34("Rakesh",EmployeesDataStatus.Active),
                new EmployeesData34("Sachin",EmployeesDataStatus.Inactive),
                new EmployeesData34("Gandhi",EmployeesDataStatus.Active),
                new EmployeesData34("nehru",EmployeesDataStatus.Inactive));

        List<EmployeesData34> list1=list.stream().filter(i->i.getStatus()==EmployeesDataStatus.Active).collect(Collectors.toList());
        list1.forEach(i->System.out.println(i.getName()));

    }
}

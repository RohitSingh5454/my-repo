package InterviewPreparation.Stream;

import java.util.Comparator;

public class DateOfBirth implements Comparator<EmployeesData> {


    @Override
    public int compare(EmployeesData o1, EmployeesData o2) {
        if (o1.getDate()==null && o2.getDate()==null){
            return 0;
        } else if (o1.getDate()==null) {
             return -1;

        } else if (o2.getDate()==null) {
            return 1;
        }
        else {
            return o1.date.compareTo(o2.getDate());
        }
    }
}

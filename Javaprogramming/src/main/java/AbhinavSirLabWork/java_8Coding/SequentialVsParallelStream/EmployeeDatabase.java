package AbhinavSirLabWork.java_8Coding.SequentialVsParallelStream;

import com.google.common.primitives.Doubles;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeDatabase {
    public static List<Employee> getAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            employeeList.add(new Employee(i, "john", "A", Double.valueOf(new Random().nextInt(1000 * 100))));
        }
        return employeeList;
    }
}

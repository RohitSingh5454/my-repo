package AbhinavSirLabWork.java_8Coding.SequentialVsParallelStream;

import InterviewPreparation.Stream.ParallelStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CodeImplementation {
    public static void main(String[] args) {
        long start=0L;
        long end=0L;
      //  start=System.currentTimeMillis();
//        IntStream.range(1,100).parallel().forEach((x)->{
//            System.out.println(Thread.currentThread().getName()+" "+x);
//        });
//        end=System.currentTimeMillis();
//        System.out.println("Time taken by seqeuntial task "+(end-start));
//        start=System.currentTimeMillis();
//        IntStream.rangeClosed(1,100).parallel().forEach(System.out::println);
//        end=System.currentTimeMillis();
//        System.out.println("Time taken by parallel stream "+(end-start));
        List<Employee> getAllEmployee=EmployeeDatabase.getAllEmployee();
        for (Employee employee:getAllEmployee) {
            System.out.println(employee);
        }
        start=System.currentTimeMillis();
        Double avgSalaryUsingSequential=getAllEmployee.stream().map(Employee::getSalary).mapToDouble(i->i)
                .average().getAsDouble();
        end=System.currentTimeMillis();
        System.out.println("Time taken by sequential stream "+(end-start)+" "+avgSalaryUsingSequential);
        start=System.currentTimeMillis();
        Double avgSalaryUsingParallel=getAllEmployee.parallelStream()
                .map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
        end=System.currentTimeMillis();
        System.out.println("Time taken by parallel stream "+(end-start)+" "+avgSalaryUsingParallel);
    }
}

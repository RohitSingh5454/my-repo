package AbhinavSirLabWork.InfosysInterviewPreparation.StudentOperation;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class implementation {
    public static void main(String[] args) {
        List<EmployeesData> list=new ArrayList<>();
        list.add(new EmployeesData(22,"Raghav","Physics",78.23));
        list.add(new EmployeesData(27,"Sachin","Chemistry",88.23));
        list.add(new EmployeesData(21,"Manohar","Math",98.23));
        list.add(new EmployeesData(29,"Sambhav","Economics",68.23));
        list.add(new EmployeesData(28,"Rahul","Biology",48.23));
        List<EmployeesData> above60=list.stream().filter(i->i.getPercentage()>60).collect(Collectors.toList());
        System.out.println(above60);
        Map<Boolean,List<EmployeesData>> moreThan60=list.stream().collect(Collectors.partitioningBy(i->i.getPercentage()>60));
        System.out.println(moreThan60);
        //top 3 performing students
        List<EmployeesData> top3Performing=list.stream().sorted(Comparator.comparing(EmployeesData::getPercentage)
                .reversed()).limit(3).collect(Collectors.toList());
        System.out.println(top3Performing);

        //name and percentage of each student
        Map<String,Double> namePercentage=list.stream().collect(Collectors.toMap(EmployeesData::getName,EmployeesData::getPercentage));
        System.out.println(namePercentage);

        // subjects offered in the college
        List<String> subjects=list.stream().map(EmployeesData::getSubject).collect(Collectors.toList());
        System.out.println(subjects);

        //max percentage min percentage average percentage
        DoubleSummaryStatistics percentage=list.stream().collect(Collectors.summarizingDouble(EmployeesData::getPercentage));
        System.out.println("max percentage is "+percentage.getMax());
        System.out.println("min percentage is "+percentage.getMin());
        System.out.println("average percentage is "+percentage.getAverage());

        // total number of students
        Long count=list.stream().collect(Collectors.counting());
        System.out.println(count);

        //grouped by subject
        Map<String,List<EmployeesData>> groupedBySubject=list.stream().collect(Collectors.groupingBy(EmployeesData::getSubject));
        System.out.println(groupedBySubject);

    }
}

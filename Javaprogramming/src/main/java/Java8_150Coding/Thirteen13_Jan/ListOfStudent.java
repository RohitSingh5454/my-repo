package Java8_150Coding.Thirteen13_Jan;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOfStudent {
    public static void main(String[] args) {
        ListOfStudent pob1=new ListOfStudent();
        pob1. filterData();

    }
        public List<Student> filterData() {
        Student obc=new Student();
            List<Student> studentList = new ArrayList<>();
            studentList.add(new Student(12, "Rakesh", "19/02/1993", 89.23));
            studentList.add(new Student(11, "santosh", "18/06/1998", 79.23));
            studentList.add(new Student(18, "Prakash", "14/04/1995", 82.23));
            studentList.add(new Student(9, "Prajwal", "12/08/1997", 94.23));
            //System.out.println(studentList);
            //using list

            List<Student> students = studentList.stream().sorted(Comparator.
                    comparingDouble(Student::getPercentage).reversed()).limit(2).collect(Collectors.toList());
            System.out.println(students);

            //using set

            Set<String> studentSet = studentList.stream().map(Student::getSname).collect(Collectors.toSet());
            System.out.println(studentSet);

            // using collectors.toMap

            Map<String, Double> doubleMap = studentList.stream().
                    collect(Collectors.toMap(Student::getSname,Student::getPercentage));
            System.out.println(doubleMap);

            //collectors to collection
            LinkedList<Student> collectionStudent = studentList.stream().limit(2).
                    collect(Collectors.toCollection(LinkedList::new));
            System.out.println(collectionStudent);

            // collectors to join

            String list = studentList.stream().map(Student::getSname).collect(Collectors.joining(" "));
            System.out.println(list);

            // collectors to counting

            Long count = studentList.stream().collect(Collectors.counting());
            System.out.println(count);

            // collecting highest percentage

            Optional<Double> maxPercentage = studentList.stream().
                    map(Student::getPercentage).collect(Collectors.maxBy(Comparator.naturalOrder()));
            System.out.println("Max percentage is " +maxPercentage);

            //sum of Percentage

            double sum=studentList.stream().collect(Collectors.summingDouble(Student::getPercentage));
            System.out.println("Sum of percentage is "+sum);

            //minyBy() function used

             Stream<Student> minBySorting =studentList.stream().sorted(Comparator.comparingDouble(Student::getPercentage));
             List<Student> list1=minBySorting.toList();
            System.out.println("Comparing student on the basis of percentage "+list1);

            //average percentage
            double averagePercentage=studentList.stream().collect(Collectors.averagingDouble(Student::getPercentage));
            System.out.println("Average percentage "+averagePercentage);

            // summarizing percentage

            DoubleSummaryStatistics summarizingPercentage=studentList.stream().
                    collect(Collectors.summarizingDouble(Student::getPercentage));
            System.out.println(summarizingPercentage);

            //Grouping By
            Map<Double,List<Student>> grougBy=studentList.stream().collect(Collectors.groupingBy(Student::getPercentage));
            System.out.println(grougBy);


            //PartioningBy

            Map<Boolean,List<Student>> grougByPartionining=studentList.stream().collect(Collectors.
                    partitioningBy(i->i.getPercentage()>80.01));
            System.out.println(grougByPartionining);

            return studentList;
        }
  /*  public  double getPercentage(){
        Student ob1=new Student();
        ListOfStudent obj1=new ListOfStudent();
        double sum=obj1.filterData().stream().map(Student::getPercentage)

    }*/

}

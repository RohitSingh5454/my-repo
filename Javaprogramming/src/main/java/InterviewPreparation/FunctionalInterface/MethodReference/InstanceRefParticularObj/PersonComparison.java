package InterviewPreparation.FunctionalInterface.MethodReference.InstanceRefParticularObj;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonComparison {
    public int CompareByName(Person p1,Person p2){
        return p1.getName().compareTo(p2.getName());
    }
    public int CompareByAge(Person p1,Person p2){
        return p1.getAge().compareTo(p2.getAge());
    }

    public static void main(String[] args) {
        PersonComparison personComparison=new PersonComparison();
        List<Person> list2= Arrays.asList(new Person(12,"Sachin"),
                new Person(19,"Akash"),new Person(10,"Rakesh"),new Person(22,"Vinod"));
        System.out.println("sort by age");
        Collections.sort(list2,personComparison::CompareByAge);
        list2.stream().map(i->i.getName()).forEach(System.out::println);
        System.out.println("sort by name");
        Collections.sort(list2,personComparison::CompareByName);
        list2.stream().map(i->i.getName()).forEach(System.out::println);

    }
}

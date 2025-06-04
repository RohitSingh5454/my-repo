package InterviewPreparation.FunctionalInterface.MethodReference.StaticReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonComparison {
    public static int CompareByName(Person p1,Person p2){
        return p1.getName().compareTo(p2.getName());
    }
    public static int CompareByAge(Person p1,Person p2){
        return p1.getAge().compareTo(p2.getAge());
    }

    public static void main(String[] args) {
        List<Person> l1=new ArrayList<>();
        l1.add(new Person(23,"Priya"));
        l1.add(new Person(34,"Akshay"));
        l1.add(new Person(27,"Biku"));
        l1.add(new Person(21,"Chandan"));
        Collections.sort(l1,PersonComparison::CompareByAge);
        System.out.println("sort by age");
        l1.stream().map(i->i.getName()).forEach(System.out::println);
        System.out.println("sort by name");
        Collections.sort(l1,PersonComparison::CompareByName);
        l1.stream().map(i->i.getName()).forEach(System.out::println);

    }
}

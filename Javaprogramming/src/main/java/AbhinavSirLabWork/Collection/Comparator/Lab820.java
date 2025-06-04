package AbhinavSirLabWork.Collection.Comparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Lab820 {
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet<>(new nameComparator());
        treeSet.add(new Student(2,"Sukesh"));
        treeSet.add(new Student(1,"Lokesh"));
        treeSet.add(new Student(4,"Somesh"));
        treeSet.add(new Student(3,"Mohit"));
        Iterator itr=treeSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
class Student {
    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return id+" "+name;
    }
}
class nameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if (o1 instanceof Student && o2 instanceof Student){
           // Student str=(Student) o1;
           // Student str1=(Student) o2;
            return o2.name.compareTo(o1.name);
        }
        return 0;
    }
}


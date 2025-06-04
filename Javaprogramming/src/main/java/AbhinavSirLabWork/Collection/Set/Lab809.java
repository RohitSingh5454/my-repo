package AbhinavSirLabWork.Collection.Set;

import java.util.LinkedHashSet;

public class Lab809 {
    public static void main(String[] args) {
        LinkedHashSet hsr=new LinkedHashSet<>();
        hsr.add(new Student(99));
        hsr.add(new Student(88));
        hsr.add(new Student(77));
        System.out.println(hsr);

    }
}
class Student{

    int sid;
    Student(int id){
        sid=id;
    }
    public String toString(){
        return " "+sid;
    }
}

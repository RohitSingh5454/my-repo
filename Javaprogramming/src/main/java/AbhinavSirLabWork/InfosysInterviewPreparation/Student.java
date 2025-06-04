package AbhinavSirLabWork.InfosysInterviewPreparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {
    int roll_No;
    String name;
    String branch;
    public Student(int sId,String sName,String sBranch){
        this.roll_No=sId;
        this.name=sName;
        this.branch=sBranch;
    }

    @Override
    public String toString() {
        return "{" +
                "roll_No=" + roll_No +
                        ", name='" + name + '\'' +
                        ", branch='" + branch + '\''+
       " }";
    }
}
class sortByRoll implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.roll_No- o2.roll_No;
    }
}
class sortByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
class implementation {
    public static void main(String[] args) {
        ArrayList<Student> al1=new ArrayList<>();
        al1.add(new Student(1,"rakesh","Science"));
        al1.add(new Student(2,"Aman","commerce"));
        al1.add(new Student(4,"vivek","arts"));
        al1.add(new Student(3,"priya","commerce"));

            Collections.sort(al1, new sortByRoll());

        System.out.println("Sorting byRoll result is "+al1);
        Collections.sort(al1,new sortByName());
        System.out.println("sort by name "+al1);
    }
}
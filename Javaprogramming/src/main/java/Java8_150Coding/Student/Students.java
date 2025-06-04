package Java8_150Coding.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Students {
    int sid;
    String name;
    String occupation;
    String dob;
    String gender;
    public Students(){

    }
    public Students(int sid,String name,String occupation,String dob,String gender){
        this.sid=sid;
        this.name=name;
        this.occupation=occupation;
        this.dob=dob;
        this.gender=gender;
    }
    public String toString(){
        return sid +"-" +name +"-" +occupation+"-"+dob+"-"+gender;
    }
    public static void main(String[] args) {
        List<Students> studentsList=new ArrayList<>();
        studentsList.add(new Students(1,"Raman","Developer","13/04/1995","Male"));
        studentsList.add(new Students(2,"Sonal","Tester","19/04/1999","Male"));
        studentsList.add(new Students(3,"Durgesh","Developer","9/04/1993","Male"));
        studentsList.add(new Students(4,"Tripti","Quality Analyst","17/11/1997","Female"));
        Predicate<Students> studentsPredicate=(Students students)->students.gender.equals("Male");
        List<Students> list=studentsList.stream().filter(i->i.gender.equals("Male")).collect(Collectors.toList());

       /* for (Students students:studentsPredicate){
            System.out.println();
        }*/


    }

}




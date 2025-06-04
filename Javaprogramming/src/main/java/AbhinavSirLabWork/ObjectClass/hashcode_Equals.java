package AbhinavSirLabWork.ObjectClass;

import java.util.LinkedHashSet;

public class hashcode_Equals {
    public static void main(String[] args) {
        Teacher ob1=new Teacher(1,"Rohan");
        Teacher ob2=new Teacher(1,"Rohan");
        System.out.println(ob1.equals(ob2));
        LinkedHashSet<Teacher> person=new LinkedHashSet<>();
        person.add(new Teacher(1,"kamal"));
        person.add(new Teacher(12,"Nishhant"));
        person.add(new Teacher(32,"lokesh"));
        person.add(new Teacher(1,"kamal"));
       // System.out.println(person);
        for (Teacher ps:person){
            System.out.println(ps);
        }
    }
}
class Teacher{
    int id;
    String name;
    public Teacher(int id,String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public int hashCode(){
        return this.id;
    }

    @Override
    public boolean equals(Object obj){
        Teacher p1=(Teacher) obj;
        return this.name.equals(name) && this.id==id;
    }
    public String toString(){
        return this.id+" "+this.name;
    }
}

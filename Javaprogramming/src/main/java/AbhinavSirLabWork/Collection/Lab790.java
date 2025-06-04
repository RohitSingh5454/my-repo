package AbhinavSirLabWork.Collection;

import java.util.ArrayList;
import java.util.List;

public class Lab790 {
    public static void main(String[] args) {
        List li=new ArrayList<>();
        li.add("Rahul");
        li.add("Sachin");
        li.add("Dhoni");
        li.add("Ganguly");
        li.add("Laxman");
        System.out.println(li);
        li.set(2,"Viru");
        System.out.println(li);
        Object obj1=li.get(2);
        System.out.println(obj1);
    }
}

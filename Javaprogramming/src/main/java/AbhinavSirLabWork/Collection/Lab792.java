package AbhinavSirLabWork.Collection;

import java.util.ArrayList;
import java.util.List;

public class Lab792 {
    public static void main(String[] args) {
        List li4=new ArrayList<>();
        li4.add("Sri");
        li4.add("Nivas");
        li4.add("Java");
        li4.add("Nivas");
        li4.add("Python");
        List li5=li4.subList(2,3);
        System.out.println(li4);
        System.out.println(li5);
    }
}

package AbhinavSirLabWork.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Lab787 {
    public static void main(String[] args) {
        Collection colee1=new ArrayList<>();
        colee1.add("Ravi");
        colee1.add(78);
        colee1.add("haman");
        Collection colee2=new ArrayList();
        colee2.add("ganguly");
        colee2.add("langer");
        colee2.add(33);

        System.out.println(colee1.addAll(colee2));
        System.out.println(colee1);
        System.out.println(colee1.removeAll(colee2));
        System.out.println(colee1);

    }
}

package AbhinavSirLabWork.Collection;

import java.util.*;
import java.util.List;

public class Lab801 {
    public static void main(String[] args) {
        List topics=new ArrayList<>();
        topics.add("Java");
        topics.add("Python");
        topics.add("Javascript");
        topics.add("Collection");
        ListIterator lit=topics.listIterator();
        System.out.println(topics);
        while (lit.hasNext()) {
            Object ob1 =  lit.next();
             System.out.println(ob1);
            if (ob1.equals("Python")) {
                lit.remove();
            } else if (ob1.equals("Java")) {
                topics.set(0, "core java");
            } else if (ob1.equals("Collection")) {
                topics.set(2,"Hashmap");
            }
        }
            System.out.println(topics);
    }
}

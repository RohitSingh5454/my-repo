package AbhinavSirLabWork.Collection.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab813 {
    public static void main(String[] args) {
        TreeSet sc=new TreeSet();
        sc.add(44);
        sc.add(76);
        sc.add(88);
        sc.add(32);
        sc.add(99);
        System.out.println("*******poll first and poll last********");

        System.out.println(sc.pollFirst());
        System.out.println(sc);
       // System.out.println(sc.pollLast());
        System.out.println(sc);
        System.out.println("*********lower**********");
        System.out.println(sc.lower(45));
        System.out.println("******higher******");
        System.out.println(sc.higher(16));
        System.out.println("ceiling use case");
        System.out.println(sc.ceiling(98));
        System.out.println("*******floor use case*****");
        System.out.println(sc.floor(33));
    }
}

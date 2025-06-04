package AbhinavSirLabWork.Collection.collectionsClass;

import java.util.*;

public class Lab845 {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.add("Srinivas");
        list.add("Dande");
        list.add("Anand");
        list.add("Kumar");
        Enumeration en= Collections.enumeration(list);
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
        Vector vect=new Vector<>();
        vect.add(99);
        vect.add("Sri");
        vect.add("sri@jlc.com");
        System.out.println("\n Enumeration to list");
        Enumeration en1=vect.elements();
        List list1=Collections.list(en1);
        System.out.println(list1);
    }
}

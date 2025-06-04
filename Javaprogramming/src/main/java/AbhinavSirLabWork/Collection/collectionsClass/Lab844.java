package AbhinavSirLabWork.Collection.collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab844 {
    public static void main(String[] args) {
        List list1=new ArrayList<>();
        list1.add("srinivas");
        list1.add("Dande");
        list1.add("Anand");
        list1.add("Kumar");
        System.out.println(list1);
        List list2=new ArrayList<>();
        list2.add("Manoj");
        list2.add("Kapil");
        list2.add("Nilav");
        list2.add("Lomror");
        System.out.println(list2);
        System.out.println("************");
        Collections.copy(list2,list1);
        System.out.println(list2);
    }
}

package AbhinavSirLabWork.Exception;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListToLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Ragahv");
        list.add("Sachin");
        list.add("Ramesh");
        list.add("Rohan");
        System.out.println(list);
        ArrayList<String> arrayList=new ArrayList<>(list);
       // System.out.println(arrayList);
        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.addAll(list);
        System.out.println(arrayList1);

    }
}

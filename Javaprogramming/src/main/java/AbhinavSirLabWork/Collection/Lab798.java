package AbhinavSirLabWork.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab798 {
    public static void main(String[] args) {
        List Arr=new ArrayList<>();
        Arr.add("Grapes");
        Arr.add("Orange");
        Arr.add("Apple");
        Arr.add("DragonFruit");
        Arr.add("Mango");
        Arr.add("Banana");
        ListIterator itc=Arr.listIterator();

        for (int i=0;i< Arr.size();i++){
            itc.add("Kiwi");
            System.out.println(itc.next());

            // System.out.println("main completed");
        }
    }
}

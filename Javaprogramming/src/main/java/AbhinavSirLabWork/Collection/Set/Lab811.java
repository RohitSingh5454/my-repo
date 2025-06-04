package AbhinavSirLabWork.Collection.Set;

import java.util.*;

public class Lab811 {
    public static void main(String[] args) {
        TreeSet sop=new TreeSet();
        sop.add(67);
        sop.add(99);
        sop.add(56);
        sop.add(66);
        System.out.println(sop);

       /* Set sop1=sop.descendingSet();
        System.out.println("Descending "+sop1);*/

        Iterator it= sop.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        Iterator it1= sop.descendingIterator();
        System.out.println("-------------------------");
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
    }
}

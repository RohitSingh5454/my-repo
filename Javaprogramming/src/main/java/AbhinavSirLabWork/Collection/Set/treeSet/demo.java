package AbhinavSirLabWork.Collection.Set.treeSet;

import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class demo {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet<>();
        ts.add("kamal");
        ts.add("Hello");
        ts.add("Hi");
        ts.add("soccer");
        //System.out.println(ts);
        Set ts1= ts.descendingSet();
       // System.out.println(ts1);
        Iterator iterator=ts.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Iterator it1=ts.descendingIterator();
        System.out.println("In descending");
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
    }
}

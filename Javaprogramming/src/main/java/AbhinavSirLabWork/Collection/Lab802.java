package AbhinavSirLabWork.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab802 {
    public static void main(String[] args) {
        List lop=new ArrayList<>();
        lop.add("Srinivas");
        lop.add("Sachin");
        lop.add("Dravid");
        lop.add("Ganguly");
        lop.add("Dhoni");
        ListIterator lit=lop.listIterator();
        System.out.println("Forward direction");
        while (lit.hasNext()){
            int index=lit.nextIndex();
            Object obj=lit.next();
            System.out.println(index+"\t"+obj);
        }
        System.out.println("Backward direction");
        while (lit.hasPrevious()){
            int index=lit.previousIndex();
            Object obj=lit.previous();
            System.out.println(index+"\t"+obj);
        }
    }
}

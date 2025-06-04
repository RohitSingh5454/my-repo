package AbhinavSirLabWork.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab803 {
    public static void main(String[] args) {
        List lopp=new ArrayList<>();
        lopp.add("Raman");
        lopp.add("Sanatan");
        lopp.add("Prateek");
        lopp.add("Rajak");
        lopp.add("Pawan");
        lopp.add("Google");
        ListIterator lit=lopp.listIterator(2);
        do {
            int id=lit.nextIndex();
            System.out.println(id);
            Object obj=lit.next();
            System.out.println(id+"\t"+obj);
        }while (lit.hasNext());
            System.out.println();
            lit=lopp.listIterator(5);
            do {
                int idc=lit.previousIndex();
                System.out.println(idc);
                Object obc=lit.previous();
                System.out.println(idc+"\t"+obc);
            }while (lit.hasPrevious());
        }
    }


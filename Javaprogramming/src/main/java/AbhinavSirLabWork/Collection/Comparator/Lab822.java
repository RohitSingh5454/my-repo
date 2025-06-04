package AbhinavSirLabWork.Collection.Comparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Lab822 {
    public static void main(String[] args) {
        TreeSet tsi=new TreeSet<>(new Loss());
        tsi.add("raghav");
        tsi.add("Sachin");
        tsi.add("Viraj");
        tsi.add("Prateek");
        tsi.add("Prince");
        Iterator ipc=tsi.iterator();
        while (ipc.hasNext()){
            System.out.println(ipc.next());
        }

    }
}


class Loss implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof StringBuilder && o2 instanceof StringBuilder){
            String stx=o1.toString();
            String sty=o2.toString();
            return stx.compareTo(sty);

        }
        return 0;
    }
}

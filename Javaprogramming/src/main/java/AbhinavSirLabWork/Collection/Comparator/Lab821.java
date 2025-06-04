package AbhinavSirLabWork.Collection.Comparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Lab821 {
    public static void main(String[] args) {
        TreeSet ty=new TreeSet(new Pot());
        ty.add("ranjan");
        ty.add("sagar");
        ty.add("lokesh");
        ty.add("pankaj");
        ty.add("shrishti");
        Iterator ipc=ty.iterator();
        while (ipc.hasNext()){
            System.out.println(ipc.next());
        }



    }
}
class Pot implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Pot && o2 instanceof Pot){
            String str1=(String) o1;
            String str2=(String) o2;
           // return str1.compareTo(str2);
            return str2.compareTo(str1);
    }
    return 0;
    }
}


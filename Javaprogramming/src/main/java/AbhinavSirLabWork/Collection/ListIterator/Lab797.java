package AbhinavSirLabWork.Collection.ListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab797 {
    public static void main(String[] args) {
        List lis=new ArrayList<>();
        Iterator itr= lis.iterator();
        if (itr.hasNext()){
            System.out.println(itr.next());
            System.out.println("main completed");
        }
    }
}

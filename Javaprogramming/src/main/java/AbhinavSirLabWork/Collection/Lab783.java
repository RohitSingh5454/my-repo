package AbhinavSirLabWork.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Lab783 {
    public static void main(String[] args) {
        Collection col3=new ArrayList<>();
        col3.add("Srinivas");
        col3.add(22);
        col3.add("Rakesh");
        col3.add(33);
        col3.add("Suraj");
        Iterator it=col3.iterator();
       // System.out.println(it);
       while (it.hasNext()){
         Object obj=it.next();
          // System.out.println(obj);
           if (obj.equals("Rakesh")){
               it.remove();
           }
           System.out.println(col3);
        }

    }
}

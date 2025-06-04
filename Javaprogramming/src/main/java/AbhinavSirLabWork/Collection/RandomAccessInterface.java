package AbhinavSirLabWork.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public class RandomAccessInterface {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.add("Sagar");
        list.add("Pawan");
        list.add("Sachin");
        list.add("Gauri");
        Object obj;

        if (list instanceof RandomAccess){
            for (int i=0,n=list.size();i<n;i++){
                obj=list.get(i);
            }
        }
        else {
            Iterator<Object> itr= list.iterator();
            while (itr.hasNext()){
                obj =itr.next();
                obj.equals("Raman");
                System.out.println(obj);

            }
        }

    }
}

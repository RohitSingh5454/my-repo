package AbhinavSirLabWork.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab799 {
    public static void main(String[] args) {
        List los=new ArrayList<>();
        los.add("Sapna");
        los.add("Drakulla");
        los.add("Sagar");
        los.add("Shardul");
        Iterator itb= los.iterator();
        while (itb.hasNext()){
            Object objx=itb.next();
            System.out.println(objx);
        }
    }
}

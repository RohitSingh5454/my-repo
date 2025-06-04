package AbhinavSirLabWork.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Lab778 {
    public static void main(String[] args) {
       Vector v=new Vector<>();
       v.add("Kavita");
       v.add("Singh");
        System.out.println(v);
        Enumeration en=v.elements();
        while (en.hasMoreElements()){
            Object ob=en.nextElement();
            System.out.println(ob);
        }
    }
}

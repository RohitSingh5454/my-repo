package AbhinavSirLabWork.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Lab794 {
    public static void main(String[] args) {
        Vector v1=new Vector();
        Enumeration enu=v1.elements();
        if (enu.hasMoreElements()){
            System.out.println(enu.nextElement());

        }
    }
}

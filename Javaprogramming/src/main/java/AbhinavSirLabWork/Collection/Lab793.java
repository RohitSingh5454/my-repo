package AbhinavSirLabWork.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Lab793 {
    public static void main(String[] args) {
        Vector v=new Vector<>();
        Enumeration en=v.elements();
        System.out.println(en.nextElement());
        System.out.println("main completed");
    }
}

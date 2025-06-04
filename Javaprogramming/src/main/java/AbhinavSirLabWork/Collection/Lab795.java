package AbhinavSirLabWork.Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Lab795 {
    public static void main(String[] args) {

    Vector v=new Vector<>();
    v.addElement("Sri");
    v.addElement("nawas");
    v.addElement("Sachin");
    v.addElement("Rahul");
        Enumeration enux=v.elements();
        while (enux.hasMoreElements()){
            System.out.println(enux.nextElement());
            System.out.println("main copmpleted");
        }

}}

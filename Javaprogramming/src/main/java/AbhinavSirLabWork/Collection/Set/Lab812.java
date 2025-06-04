package AbhinavSirLabWork.Collection.Set;

import java.util.TreeSet;

public class Lab812 {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet<>();
        ts.add(33);
        ts.add(31);
        ts.add(34);
        ts.add(88);
        ts.add(11);
        ts.add(4552);
       /* System.out.println(ts);
        System.out.println("******SubSet**********");
        System.out.println(ts.subSet(31,88));*/
        //System.out.println(ts.subSet(11,true,32,true));
        System.out.println("**********head set******");
        System.out.println(ts.headSet(34));
        System.out.println(ts.headSet(34,true));
        System.out.println("**********tail set**********");
        System.out.println(ts.tailSet(-77));
    }
}

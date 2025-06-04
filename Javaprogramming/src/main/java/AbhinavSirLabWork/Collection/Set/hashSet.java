package AbhinavSirLabWork.Collection.Set;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet hs=new HashSet<>();
        boolean b1=hs.add("Java");
        boolean b2=hs.add("Collection");
        boolean b3=hs.add("Java");
        System.out.println(b1+" "+b2+" "+b3);
    }
}

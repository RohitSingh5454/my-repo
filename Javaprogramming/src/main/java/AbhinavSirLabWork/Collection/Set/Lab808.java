package AbhinavSirLabWork.Collection.Set;

import java.util.LinkedHashSet;

public class Lab808 {
    public static void main(String[] args) {
        LinkedHashSet lhs=new LinkedHashSet<>();
        lhs.add(new Long(65));
        lhs.add(new Byte((byte) 65));
        lhs.add(new Integer(65));
        lhs.add("B");
        System.out.println(lhs);
    }
}

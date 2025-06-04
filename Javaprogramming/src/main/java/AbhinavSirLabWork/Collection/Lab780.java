package AbhinavSirLabWork.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Lab780 {
    public static void main(String[] args) {
        Collection col=new ArrayList<>();
        System.out.println(col);
        System.out.println("Size  "+col.size());
        System.out.println("Empty "+col.isEmpty());
        col.add("Ravi");col.add("Sachin");
        col.add(12);
        col.add("Dravid");
        col.add(34);
        System.out.println(col);
        System.out.println("size "+col.size());
        System.out.println("Empty "+col.isEmpty());
    }
}

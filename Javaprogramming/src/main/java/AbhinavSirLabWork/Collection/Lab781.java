package AbhinavSirLabWork.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Lab781 {
    public static void main(String[] args) {
        Collection col1=new ArrayList<>();
        col1.add(34);
        col1.add("java360");
        col1.add("Rakesh");
        col1.add(33);
        System.out.println(col1.contains(34));
        System.out.println(col1.contains("Suraj"));
        System.out.println(col1.remove(33));
        System.out.println(col1);
        col1.clear();
        System.out.println(col1);
    }
}

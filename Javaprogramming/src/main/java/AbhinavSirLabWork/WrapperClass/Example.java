package WrapperClass;

import java.util.ArrayList;
import java.util.Iterator;

public class Example {
    public static void main(String[] args) {
        int a=678;
        Integer wr=new Integer(4524);
        System.out.println(wr);
        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(433);
        a1.add(76657);
        a1.add(wr);
        Iterator iterator=a1.iterator();
        System.out.println("Result is : "+iterator);

    }
}

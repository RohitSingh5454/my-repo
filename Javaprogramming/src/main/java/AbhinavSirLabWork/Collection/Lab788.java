package AbhinavSirLabWork.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Lab788 {
    public static void main(String[] args) {
        Collection x1=new ArrayList<>();
        x1.add(33);
        x1.add(67);
        x1.add(89);
        System.out.println(x1);
        Collection x2=new ArrayList<>();
        x2.add(455);x2.add(544);
        x2.add(33);x2.add(89);
        x2.add(67);
        System.out.println(x2.retainAll(x1));
        System.out.println(x2+" "+x1);
       // System.out.println("x1 result is "+x1);

    }
}

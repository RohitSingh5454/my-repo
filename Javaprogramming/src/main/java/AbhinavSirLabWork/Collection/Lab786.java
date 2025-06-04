package AbhinavSirLabWork.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Lab786 {
    public static void main(String[] args) {
        Collection cole1=new ArrayList<>();
        cole1.add(22);
        cole1.add("Sagar");
        cole1.add("Priya");
        cole1.add(44);cole1.add(56);
        Collection cole2=new ArrayList<>();
        cole2.add(56);cole2.add("Sagar");cole2.add(44);
        Collection cole3=new ArrayList<>();
        cole3.add(23);cole3.add("Prateek");cole3.add(56);
        System.out.println(cole1.containsAll(cole2));
        System.out.println(cole3.containsAll(cole1));

    }
}

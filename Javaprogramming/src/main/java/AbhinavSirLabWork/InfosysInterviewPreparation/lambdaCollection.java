package AbhinavSirLabWork.InfosysInterviewPreparation;

import java.util.ArrayList;
import java.util.Collections;

public class lambdaCollection {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(104);
        al.add(209);
        al.add(340);
        al.add(102);
        al.add(102);
        al.add(99);
        System.out.println("Elemnets before sorting "+al);
        Collections.sort(al,(ob1,ob2)->(ob1>ob2)?-1:(ob1<ob2)?1:0);
        System.out.println("Elements after sorting "+al);
    }
}

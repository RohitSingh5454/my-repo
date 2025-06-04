package AbhinavSirLabWork.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Lab782 {
    public static void main(String[] args) {
        Collection col2=new ArrayList<>();
        col2.add("Srinivas");
        col2.add("Paytm");
        col2.add(33);
        col2.add(55);
        col2.add("Sachin");
        Object arr[]=col2.toArray();
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            arr[i]="Jlc";
        }
        System.out.println(col2);
    }
}

package AbhinavSirLabWork.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Lab784 {
    public static void main(String[] args) {
        Collection col4=new ArrayList();
        col4.add("sapna");
        col4.add(44);
        col4.add("krish");
        col4.add("sachin");
        //System.out.println(col4);
        Collection col5=new ArrayList<>();

        col5.add("Dravid");
        col5.add(33);
        col5.add("Virat");
        System.out.println(col5+"\t"+col5.size());
        col5.addAll(col4);
        //System.out.println(col5+" size "+col5.size());


    }
}

package AbhinavSirLabWork.Collection.Map;

import java.util.*;

public class Lab828 {
    public static void main(String[] args) {
        Map hs=new LinkedHashMap();
        hs.put("sid","jlc-009");
        hs.put("name","sri");
        hs.put("email","sri@jlc.com");
        hs.put("phone","987554543");
        hs.put("phone","987554543");
        hs.put("add","matharike");
        Set s1=hs.entrySet();
        Iterator ite=s1.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }
    }
}

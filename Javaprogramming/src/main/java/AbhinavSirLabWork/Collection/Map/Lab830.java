package AbhinavSirLabWork.Collection.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Lab830 {
    public static void main(String[] args) {
        Map tm=new TreeMap();
        tm.put("eid","jlc-008");
        tm.put("name","srinivas");
        tm.put("phone","8776544333");
        tm.put("add","matarike");
        Set s1=tm.entrySet();
        Iterator itv= s1.iterator();
        while (itv.hasNext()){
            System.out.println(itv.next());
        }
    }
}

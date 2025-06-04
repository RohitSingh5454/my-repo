package AbhinavSirLabWork.Collection.Map;

import java.util.*;

public class Lab826 {
    public static void main(String[] args) {
        Map ms=new LinkedHashMap();
        ms.put("eid",new Integer(44));
        ms.put("name","Srinivas");
        ms.put("phone ",new Long(76565355435L));
        System.out.println("print keys");
        Set keys=ms.keySet();
        Iterator itx= keys.iterator();
        while (itx.hasNext()){
            Object ob=itx.next();
            System.out.println(ob);
        }
        System.out.println("print values");
        Collection values=ms.values();
        Iterator itc= values.iterator();
        while (itc.hasNext()){
            Object obc=itc.next();
            System.out.println(obc);
        }
    }
}

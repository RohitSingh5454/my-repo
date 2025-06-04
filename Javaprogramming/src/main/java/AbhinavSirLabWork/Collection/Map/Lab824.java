package AbhinavSirLabWork.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab824 {

    public static void main(String[] args) {
        Map m1= new HashMap<>();
        m1.put("eid",new Integer(87));
        m1.put("name","Srinivas");
        m1.put("phone",new Long(976548848l));
        m1.put("valid",new Boolean(true));
        System.out.println(m1);
        System.out.println(m1.containsKey("eid"));
        System.out.println(m1.containsValue("Srinivas"));
        System.out.println(m1.containsKey("sex"));
        System.out.println(m1.containsValue(86));
        System.out.println(m1.containsValue(true));

    }
        }

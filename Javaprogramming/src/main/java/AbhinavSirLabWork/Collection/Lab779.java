package AbhinavSirLabWork.Collection;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;

public class Lab779 {
    public static void main(String[] args) {
        Properties p1=new Properties();
        p1.put(1,"Jayant");
        p1.put(2,"Kamal");
        p1.put(3,"Sankoch");
        p1.put(4,"prithvi");
        p1.put(5,"vansh");
        Enumeration en=p1.propertyNames();
        while (en.hasMoreElements()){
            //Object ob=en.nextElement();
            String str=(String) en.nextElement();
            String val=p1.getProperty(str);
            System.out.println(str +"\t\t"+val);
        }
    }
}

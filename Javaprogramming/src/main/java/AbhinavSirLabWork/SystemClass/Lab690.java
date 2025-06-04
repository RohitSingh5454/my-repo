package AbhinavSirLabWork.SystemClass;

import java.util.Enumeration;
import java.util.Properties;

public class Lab690 {
    public static void main(String[] args) {
        System.out.println("\n***** Accesing all properties");
        Properties p=System.getProperties();
        Enumeration enm=p.propertyNames();
        System.out.println(p);
        System.out.println(enm);
         while (enm.hasMoreElements()){
            String pname=enm.nextElement().toString();
            String str=System.getProperty(pname);
             System.out.println(pname+" \n"+str);
        }
    }
}

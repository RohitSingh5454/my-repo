package AbhinavSirLabWork.SystemClass;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Lab692 {
    public static void main(String[] args) {
        String pval=System.getenv("path");
        System.out.println(pval);
        System.out.println();
        Map map=System.getenv();
        System.out.println(map);
        Set set=map.entrySet();
        Iterator it= set.iterator();
        while (it.hasNext())
        {
            Map.Entry ent=(Map.Entry)it.next();
            System.out.println(ent.getKey()+"\t\t"+ent.getValue());
        }
    }
}

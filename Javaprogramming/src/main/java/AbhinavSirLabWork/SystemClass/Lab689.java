package AbhinavSirLabWork.SystemClass;

import java.util.Date;

public class Lab689 {
    public static void main(String[] args) {
        long time=System.currentTimeMillis();
        System.out.println(time);
        Date dt=new Date(time);
        System.out.println(dt);
        String pnm=System.getProperty("os.name");
        System.out.println(pnm);
        String pnx=System.setProperty("os.name","linux");
        String pmn=System.getProperty("os.name");
        System.out.println(pmn);
        System.setProperty("jlc.website","www.jlcindia.com");
        System.out.println(System.getProperty("jlc.website"));

    }
}

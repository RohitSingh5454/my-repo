package ObjectClass;

public class Lab607 {
    public static void main(String[] args) {
       Hup obj1=new Hup(12,"Srinivas");
       Hup obj2=new Hup(12,"Srinivas");
       Hup obj3=new Hup(45,"Srinivas");
        System.out.println(obj1==obj2);
        System.out.println(obj2==obj3);
        System.out.println(obj1.equals(obj2));
        String str1=new String("Ramesh");
        String str2=new String("Ramesh");
        System.out.println("Check equals in case of string : "+str1.equals(str2));
    }
}
class Hup{
    int sid;
    String name;

    public Hup(int sid, String name) {
        this.sid = sid;
        this.name = name;
    }
}

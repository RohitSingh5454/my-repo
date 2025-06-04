package AbhinavSirLabWork.ObjectClass;

public class Lab601 {
    public static void main(String[] args) {
     Boos n1=new Boos(12,987654321);
     Boos n2=new Boos(12,987654321);
     Boos n3=new Boos(28,796785432);
     Boos n4=n2;
        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());
        System.out.println(n1==n2);
        System.out.println(n4==n2);
    }
}
class Boos{
    int sid;
    long sno;

    public Boos(int sid, long sno) {
        this.sid = sid;
        this.sno = sno;
    }
}

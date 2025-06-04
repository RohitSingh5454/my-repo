package Inheritance;

public class MNB {
    public static void main(String[] args) {
    RTP obj1=new RTP();
    obj1.Get();
    }
}
class BPT{
    static int a=78;
}
class RTP extends BPT{
     int a=65;
    void Get(){
        int a=89;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}

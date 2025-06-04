package AbhinavSirLabWork.ThisKeyword;

public class Lab341 {
    public static void main(String[] args) {
        Gfg obj1=new Gfg();
        obj1.Show();
    }
}
class Gfg{
    int a=23;
    static int b=76;
    void Show(){
        String a="JLC";
        String b="Srk";
        System.out.println(a);
        System.out.println(b);
        System.out.println(this.a);
        System.out.println(this.b);

    }
}

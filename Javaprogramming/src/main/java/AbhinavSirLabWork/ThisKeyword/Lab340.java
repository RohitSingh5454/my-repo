package AbhinavSirLabWork.ThisKeyword;

public class Lab340 {
    public static void main(String[] args) {
        A obj1=new A();
        obj1.sin();
    }
}
class A{
    static int a=89;
    void sin(){
        String a="Ramnohan";
        System.out.println(a);
        System.out.println(this.a);
    }
}

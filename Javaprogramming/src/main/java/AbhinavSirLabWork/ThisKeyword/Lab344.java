package AbhinavSirLabWork.ThisKeyword;

public class Lab344 {
    public static void main(String[] args) {
        Hi obj1=new Hi(88);
        Hi obj2=new Hi();
        obj1.Show();
    }
}
class Hi{
    int a;
    Hi(){
        System.out.println("This is Dc");
    }
    Hi(int a){
        this();
        System.out.println("Hello 1-arg constructor");
        this.a=a;
    }
    void Show(){
        System.out.println(a);
    }
}

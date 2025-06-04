package AbhinavSirLabWork.Cloning.ShallowCopy;

public class Hai {
    int x;
    Hai(int x){
        this.x=x;
    }
}
class Hello implements Cloneable{
    Hai hai;
    int y;
    Hello( Hai hai,int y){
        this.hai=hai;
        this.y=y;
    }
    void show(){
        System.out.println("Hai x "+hai.x);
        System.out.println("Hello y "+y);
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Hello{" +
                "hai=" + hai +
                ", y=" + y +
                '}';
    }
}
class Implementation{
    public static void main(String[] args) throws CloneNotSupportedException {
        Hai hai=new Hai(10);
        Hello h1=new Hello(hai,20);
        Hello h2=(Hello) h1.clone();
        h1.show();
        h2.show();
        System.out.println(h1==h2);
        System.out.println(h1.hai==h2.hai);
        h2.y=30;
        h1.show();
        h2.show();
        h2.hai.x=111;
        h1.show();
        h2.show();

    }
}

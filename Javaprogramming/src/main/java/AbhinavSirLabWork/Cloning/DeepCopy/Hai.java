package AbhinavSirLabWork.Cloning.DeepCopy;

public class Hai {
    int x;
    Hai(int x){
        this.x=x;
    }
}
class Hello implements Cloneable{
    Hai hai;
    int y;
    Hello(Hai hai,int y){
        this.hai=hai;
        this.y=y;
    }
    void show(){
        System.out.println("Hai->x "+hai.x);
        System.out.println("Hello-> "+y);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        if (this instanceof Cloneable){
            Hai hai=new Hai(this.hai.x);
            Hello hello=new Hello(hai,this.y);
            return hello;
        }else {
            throw new CloneNotSupportedException();
        }
    }
}
class Implementation{
    public static void main(String[] args) throws CloneNotSupportedException {
        Hai hai=new Hai(10);
        Hello hello1=new Hello(hai,20);
        Hello hello2=(Hello) hello1.clone();
        System.out.println(hello1==hello2);
        System.out.println(hello1.hai==hello2.hai);
        hello1.show();
        hello1.show();
        hello2.hai.x=30;
        hello2.y=40;
        hello2.show();
        hello2
                .show();
    }
}
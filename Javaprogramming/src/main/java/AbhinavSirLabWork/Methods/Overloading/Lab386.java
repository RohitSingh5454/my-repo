package AbhinavSirLabWork.Methods.Overloading;

public class Lab386 {
    public static void main(String[] args) {
     Hike obv=new Hike();
     byte b=34;
     obv.add(23,b);
    int c= obv.add(b,b);
        System.out.println(c);


    }
}
class Hike{
    int add(int a,byte b){
        System.out.println("add(int,byte)");
        return a+b;
    }
}

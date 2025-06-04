package Polymorphism;

public class Chat {
    double BC(int a,double b){
        return a+b;

    }
    double BC(int x,int y){
        return x+y;

    }

}
class NeverGiveUp{
    public static void main(String[] args) {
      Chat obj2=new Chat();
        System.out.println(obj2.BC(12,45));
    }
}

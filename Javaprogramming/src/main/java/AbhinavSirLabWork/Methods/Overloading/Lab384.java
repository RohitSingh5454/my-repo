package AbhinavSirLabWork.Methods.Overloading;

public class Lab384 {
    public static void main(String[] args) {
       Captain obj1=new Captain();
      int x= obj1.add(11,22);
      String p= obj1.add("Sachin",88);
        System.out.println(x+" "+p);

    }
}
class Captain{

    int add(int a,int b){
        System.out.println("add() method");
        return a+b;
    }
    String add(String a,int b){
        System.out.println("add1() method");
        return a+b;
    }
}

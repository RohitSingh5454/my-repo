package AbhinavSirLabWork.Methods.Overloading;

public class Lab385 {
    public static void main(String[] args) {
       Pojo obx=new Pojo();
      String i= obx.add(45,"Ravi");
      String n= obx.add("raman",77);
        System.out.println(" "+i+" "+n);


    }
}
class Pojo{
   String add(int a,String b){
        System.out.println("add(int,String)");
        return a+b;
    }
    String add(String b,int a){
        System.out.println("add(String,int");
        return b+a;
    }
}

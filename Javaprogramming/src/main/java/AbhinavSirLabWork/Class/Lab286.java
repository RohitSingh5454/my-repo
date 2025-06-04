package AbhinavSirLabWork.Class;

public class Lab286 {
    public static void main(String[] args) {
        Customer obj1=new Customer();
        obj1.show();
        Customer obj2=new Customer();
        obj2.cid=99;
        obj2.cname="Hariom";
        obj2.phone=998876666;
        obj2.show();
        Customer obj3=new Customer();
    }
}
class Customer{
  int cid;
   String cname;
    long phone;
    void show(){
        System.out.println(cid);
        System.out.println(cname);
        System.out.println(phone);

    }
}

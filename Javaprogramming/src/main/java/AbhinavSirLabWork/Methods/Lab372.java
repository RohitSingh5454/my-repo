package AbhinavSirLabWork.Methods;

public class Lab372 {
    public static void main(String[] args) {
         Lop l1=new Lop();
        l1.isShow('A');
        System.out.println(l1.isShow('A'));
    }
}
class Lop{
    boolean isShow(char ch){
        System.out.println("isShow() method : "+ch);
        boolean b=ch>=48 && ch<=98;
        return b;
    }
}

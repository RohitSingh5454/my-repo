package Constructor;

public class PWD {
    public static void main(String[] args) {
        NMDC n1=new NMDC();
        n1.Show();
        NMDC n2=new NMDC();
        n2.Show();
    }
}
class NMDC{
    static int a;
    String name;
   NMDC(){
        System.out.println("The result is : "+a+" "+name);
    }
    void Show(){
        System.out.println("The result is : "+a+" "+name);
    }
}

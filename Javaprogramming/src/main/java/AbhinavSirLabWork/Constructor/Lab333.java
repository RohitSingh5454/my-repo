package Constructor;

public class Lab333 {
    public static void main(String[] args) {
        ANI a1=new ANI(2,"Gautam");
        a1.Press();
        ANI a2=new ANI(3,"Saurav");
        a2.Press();
        ANI a3=new ANI();
        a3.Press();
    }
}
class ANI{
    int sid;
    String sname;
    ANI(int sid,String sname){
        System.out.println("Argument constructor");
       this. sid=sid;
        this.sname=sname;
    }
    ANI()
    {
        System.out.println("This is No argument constructor");

    }
    void Press(){

        System.out.println("Result is : "+sname+" "+sid);
    }
}

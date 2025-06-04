package AbhinavSirLabWork.Constructor;

public class Lab330 {
    public static void main(String[] args) {
     Raw r1 = new Raw();
    /* r1.name1="Krish";
     r1.sid=44;*/
     r1.Sin();
    }
}
 class Raw{
    int sid=576;
    String name1="Superman";
    Raw(){

        System.out.println("This is default constructor");
    }
    void Sin()
    {
        System.out.println("Result is : "+sid+" "+name1);
    }
 }

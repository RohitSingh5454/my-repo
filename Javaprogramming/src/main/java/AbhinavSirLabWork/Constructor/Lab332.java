package Constructor;

public class Lab332 {
    public static void main(String[] args) {
    Post p1=new Post(1,"Rameshwaram");
    //Post p2=new Post();  //--error(As there is no default constructor)
    p1.sid=34;
    p1.sname="Raman";
    p1.Sky();
    }
}
class Post{
    int sid;
    String sname;

    public Post(int id, String name) {
        System.out.println("This is arg constructor");
    sid=id;
    sname=name;
    }
    void Sky(){
        System.out.println("Result is : "+sname+" "+sid);
    }

}

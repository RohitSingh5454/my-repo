package AbhinavSirLabWork.Constructor;

public class Lab336 {
    public static void main(String[] args) {
        Hero obj1=new Hero();
        Hero ob2=new Hero(2,"Rakesh");
        obj1.Show();
        ob2.Show();

    }
}
class Hero{
    int id;
    String name;
    Hero(int sid,String sname){
       id=sid;
       name=sname;
    }
    Hero(){
        System.out.println("This is default costructor");
    }
    void Show(){
        System.out.println(id+" "+name);
    }
}
package AbhinavSirLabWork.Constructor;

public class ConstructorImple {
    public static void main(String[] args) {
        Stud obj1=new Stud(2,"Sushant");
    }
}
class Stud{
    int id;
    String name;

    Stud(int id,String name){
        this.id=id;
        this.name=name;
    }
}

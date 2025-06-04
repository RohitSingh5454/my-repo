package AbhinavSirLabWork.ObjectClass;

public class Lab603 {
    public static void main(String[] args) {
        Student4 stud4 = null;
        int a=34;
        int b=34;
        System.out.println(a==b);
        Integer ref1=new Integer(1234);
        Integer ref2=new Integer(1234);
        System.out.println(ref1==ref2);
        System.out.println(stud4);
        stud4 = new Student4(12, "Farji");
        System.out.println(stud4);
        String str = new String("Java Learning center");
        System.out.println(str);
        Integer inteRef = new Integer(198);

        System.out.println(inteRef);

    }
}
class Student4{
    int id;
    String name;
    Student4(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return id+" "+name;
    }
}

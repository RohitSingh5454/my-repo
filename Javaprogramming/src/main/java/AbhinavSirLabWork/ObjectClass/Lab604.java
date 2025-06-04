package AbhinavSirLabWork.ObjectClass;

public class Lab604 {
    public static void main(String[] args) {
        Student5 stu5=new Student5(23,"Pawan");
        System.out.println(stu5);
        Integer hashcode=stu5.hashCode();
        System.out.println(hashcode);
        String str=stu5.getClass().getName();
        System.out.println(str);
        String hx=Integer.toHexString(hashcode);
        System.out.println(hx);
        String cname=str+"@"+hx;
        System.out.println(cname);


    }
}
class Student5{
    int id;
    String sname;
    Student5(int id,String sname){
        this.id=id;
        this.sname=sname;

    }
}
